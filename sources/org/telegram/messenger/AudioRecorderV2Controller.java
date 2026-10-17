package org.telegram.messenger;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.ui.ac0;
import ri.p;
public final class AudioRecorderV2Controller {
    private boolean finishRequested;
    private final Listener listener;
    private boolean released;
    private final ri.p session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private ri.n previousState = ri.n.f45845a;

    public interface Listener {
        void onCompleted(ri.m mVar);

        void onError(Exception exc);

        void onOutputInvalidated(File file);

        void onOutputStarted(File file);

        void onPreviewReady(long j10, File file, byte[] bArr);

        void onRecordingProgress(long j10, double d);

        void onRecordingResumed();

        void onRecordingStarted();

        void onRecordingTooShort(long j10);
    }

    public AudioRecorderV2Controller(Context context, File file, final Listener listener) {
        this.listener = listener;
        ?? obj = new Object();
        obj.f7649c = ri.i.f45833a;
        obj.f7650f = ri.p.G;
        obj.f7647a = context;
        obj.f7648b = file;
        ri.i iVar = (ri.i) ti.e.f47237c.a();
        if (iVar != null) {
            obj.f7649c = iVar;
            obj.d = new ri.g() {
                {
                    AudioRecorderV2Controller.this = this;
                }

                @Override
                public void onCompleted(ri.m mVar) {
                    listener.onCompleted(mVar);
                }

                @Override
                public void onError(Exception exc) {
                    listener.onError(exc);
                }

                @Override
                public void onPreviewReady(long j10, long j11, long j12, byte[] bArr) {
                    File file2;
                    if (AudioRecorderV2Controller.this.finishRequested) {
                        AudioRecorderV2Controller.this.finishRequested = false;
                        AudioRecorderV2Controller.this.session.h();
                        return;
                    }
                    ri.p pVar = AudioRecorderV2Controller.this.session;
                    pVar.getClass();
                    ri.p.p();
                    ri.j jVar = pVar.f45874z;
                    if (pVar.f45862m == ri.n.e && jVar != null) {
                        file2 = jVar.f45837b;
                    } else {
                        file2 = null;
                    }
                    if (file2 == null) {
                        listener.onError(new IllegalStateException("Preview file is unavailable"));
                    } else {
                        listener.onPreviewReady(j10, file2, bArr);
                    }
                }

                @Override
                public void onRecordingProgress(long j10, double d) {
                    listener.onRecordingProgress(j10, d);
                }

                @Override
                public void onRecordingTooShort(long j10) {
                    listener.onRecordingTooShort(j10);
                }

                @Override
                public void onStateChanged(ri.o oVar) {
                    ri.n nVar = oVar.f45852a;
                    ri.n nVar2 = AudioRecorderV2Controller.this.previousState;
                    AudioRecorderV2Controller.this.previousState = nVar;
                    if (nVar == ri.n.f45847c) {
                        if (!AudioRecorderV2Controller.this.finishRequested && nVar2 == ri.n.f45846b) {
                            listener.onRecordingStarted();
                        } else if (!AudioRecorderV2Controller.this.finishRequested && nVar2 == ri.n.f45848f) {
                            listener.onRecordingResumed();
                        }
                        AudioRecorderV2Controller.this.completePendingFinish(nVar);
                    }
                }

                @Override
                public void onMaximumDurationReached() {
                }

                @Override
                public void onPreviewPlaybackChanged(boolean z10) {
                }

                @Override
                public void onPreviewProgress(long j10, long j11) {
                }
            };
            obj.e = new AnonymousClass2(listener);
            obj.f7650f = new ri.h() {
                {
                    AudioRecorderV2Controller.this = this;
                }

                @Override
                public void error(String str, Throwable th2) {
                    FileLog.e("AudioRecorderV2 " + str, th2);
                }

                @Override
                public void log(String str) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("AudioRecorderV2 " + str);
                    }
                }
            };
            if (((ri.g) obj.d) != null) {
                if (((ri.l) obj.e) != null) {
                    this.session = new ri.p(obj);
                    return;
                }
                throw new IllegalStateException("Output listener is required");
            }
            throw new IllegalStateException("Session listener is required");
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public void completePendingFinish(ri.n nVar) {
        if (this.finishRequested) {
            if (nVar != ri.n.f45847c && nVar != ri.n.e) {
                return;
            }
            this.finishRequested = false;
            this.session.h();
        }
    }

    public void cancel() {
        this.finishRequested = false;
        this.session.b();
    }

    public boolean detachPreviewOutput() {
        ri.p pVar = this.session;
        pVar.getClass();
        ri.p.p();
        ri.m mVar = null;
        byte[] bArr = null;
        mVar = null;
        mVar = null;
        mVar = null;
        mVar = null;
        if (pVar.f45862m == ri.n.e && pVar.f45874z != null && pVar.f45867r == 0 && pVar.f45868s == pVar.j()) {
            pVar.o();
            ri.j jVar = pVar.f45874z;
            long j10 = pVar.j();
            long length = jVar.f45837b.length();
            pVar.a(jVar, length);
            synchronized (pVar.f45860k) {
                if (jVar.d && !jVar.e) {
                    jVar.e = true;
                    pVar.f45859j.execute(new ri.c(pVar, jVar, length, j10, 0));
                    File file = jVar.f45837b;
                    byte[] bArr2 = pVar.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    pVar.C = new ri.m(file, j10, bArr);
                    pVar.r(ri.n.f45849n);
                    pVar.c();
                    pVar.s();
                    pVar.l("detached_preview");
                    mVar = pVar.C;
                }
            }
        }
        if (mVar == null) {
            return false;
        }
        this.session.n();
        this.released = true;
        return true;
    }

    public void finishWhenReady() {
        this.finishRequested = true;
        ri.p pVar = this.session;
        pVar.getClass();
        ri.p.p();
        completePendingFinish(pVar.e().f45852a);
    }

    public boolean isPreviewing() {
        ri.p pVar = this.session;
        pVar.getClass();
        ri.p.p();
        if (pVar.e().f45852a == ri.n.e) {
            return true;
        }
        return false;
    }

    public void release() {
        this.session.n();
        this.released = true;
    }

    public boolean setTrimRange(long j10, long j11) {
        ri.p pVar = this.session;
        pVar.getClass();
        ri.g gVar = pVar.e;
        ri.p.p();
        if (pVar.f45862m == ri.n.e) {
            long j12 = pVar.j();
            long max = Math.max(0L, Math.min(j12, j10));
            long max2 = Math.max(max, Math.min(j12, j11));
            if (max2 - max < Math.min(pVar.f45855c, j12)) {
                return false;
            }
            pVar.f45867r = max;
            pVar.f45868s = max2;
            i2.g0 g0Var = pVar.A;
            if (g0Var != null) {
                g0Var.Z0(5, max);
            }
            gVar.onPreviewProgress(pVar.f45867r, j12);
            gVar.onStateChanged(pVar.e());
            return true;
        }
        return false;
    }

    public boolean start() {
        ri.p pVar = this.session;
        pVar.getClass();
        ri.p.p();
        if (pVar.f45862m != ri.n.f45845a) {
            return false;
        }
        File file = pVar.f45854b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            pVar.f45857g.b("start requested");
            pVar.d();
            pVar.r(ri.n.f45846b);
            pVar.t(null);
            return true;
        }
        pVar.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public boolean togglePause() {
        ri.p pVar = this.session;
        pVar.getClass();
        ri.p.p();
        ri.n nVar = pVar.e().f45852a;
        if (nVar == ri.n.f45847c) {
            return this.session.m();
        }
        ri.n nVar2 = ri.n.e;
        if (nVar == nVar2) {
            final ri.p pVar2 = this.session;
            pVar2.getClass();
            ri.p.p();
            if (pVar2.f45862m == nVar2) {
                ri.b bVar = pVar2.f45857g;
                bVar.b("resume requested: trim=" + pVar2.f45867r + ".." + pVar2.f45868s + ", sourceDurationMs=" + pVar2.j());
                pVar2.o();
                pVar2.r(ri.n.f45848f);
                final ri.j jVar = pVar2.f45874z;
                if (jVar == null) {
                    pVar2.g(new IllegalStateException("Output generation is missing"));
                    return true;
                }
                final long j10 = pVar2.f45867r;
                final long j11 = pVar2.f45868s;
                final long j12 = ((j11 - j10) * 48000) / 1000;
                pVar2.k(ri.k.f45839a);
                pVar2.f45858i.execute(new Runnable() {
                    @Override
                    public final void run() {
                        File file;
                        File file2;
                        long j13 = j12;
                        p pVar3 = p.this;
                        Handler handler = pVar3.h;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        File file3 = jVar.f45837b;
                        long j14 = j10;
                        int i10 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
                        long j15 = j11;
                        if (i10 <= 0) {
                            file = file3;
                            try {
                                if (j15 >= p.q(pVar3.f45865p)) {
                                    file2 = file;
                                    ri.b bVar2 = pVar3.f45857g;
                                    bVar2.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j14 + ".." + j15 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                                    handler.post(new ac0(pVar3, j13, file2, 3));
                                }
                            } catch (Throwable th2) {
                                handler.post(new ri.d(pVar3, th2, 1));
                                return;
                            }
                        } else {
                            file = file3;
                        }
                        file2 = pVar3.f("trim");
                        boolean b10 = AudioRecorderNative.b(file.getAbsolutePath(), file2.getAbsolutePath(), j14, j15);
                        j15 = j15;
                        if (!b10) {
                            throw new IllegalStateException("Unable to trim Opus prefix");
                        }
                        ri.b bVar22 = pVar3.f45857g;
                        bVar22.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j14 + ".." + j15 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                        handler.post(new ac0(pVar3, j13, file2, 3));
                    }
                });
                return true;
            }
            return false;
        }
        return false;
    }

    public class AnonymousClass2 implements ri.l {
        final Listener val$listener;

        public AnonymousClass2(Listener listener) {
            AudioRecorderV2Controller.this = r1;
            this.val$listener = listener;
        }

        public void lambda$onOutputInvalidated$1(long j10, Listener listener, File file) {
            if (AudioRecorderV2Controller.this.deliveredOutputIds.remove(Long.valueOf(j10))) {
                listener.onOutputInvalidated(file);
            }
        }

        public void lambda$onOutputStarted$0(long j10, Listener listener, File file) {
            if (AudioRecorderV2Controller.this.released) {
                return;
            }
            AudioRecorderV2Controller.this.deliveredOutputIds.add(Long.valueOf(j10));
            listener.onOutputStarted(file);
        }

        @Override
        public void onOutputCompleted(long j10, File file, long j11, long j12) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
        }

        @Override
        public void onOutputInvalidated(long j10, ri.k kVar) {
            File file;
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                file = (File) AudioRecorderV2Controller.this.outputFiles.remove(Long.valueOf(j10));
            }
            if (file != null) {
                AudioRecorderV2Controller.this.mainHandler.post(new s(this, j10, this.val$listener, file, 0));
            }
        }

        @Override
        public void onOutputStarted(long j10, File file) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
            AudioRecorderV2Controller.this.mainHandler.post(new s(this, j10, this.val$listener, file, 1));
        }

        @Override
        public void onOutputError(long j10, Exception exc) {
        }

        @Override
        public void onBytesAvailable(long j10, File file, long j11, long j12) {
        }
    }
}
