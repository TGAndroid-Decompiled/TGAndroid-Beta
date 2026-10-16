package org.telegram.messenger;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import qi.q;
public final class AudioRecorderV2Controller {
    private boolean finishRequested;
    private final Listener listener;
    private boolean released;
    private final qi.q session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private qi.o previousState = qi.o.f43421a;

    public interface Listener {
        void onCompleted(qi.n nVar);

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
        obj.f6196c = qi.j.f43409a;
        obj.f6197f = qi.q.G;
        obj.f6194a = context;
        obj.f6195b = file;
        qi.j jVar = (qi.j) si.e.f45486c.a();
        if (jVar != null) {
            obj.f6196c = jVar;
            obj.d = new qi.h() {
                {
                    AudioRecorderV2Controller.this = this;
                }

                @Override
                public void onCompleted(qi.n nVar) {
                    listener.onCompleted(nVar);
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
                    qi.q qVar = AudioRecorderV2Controller.this.session;
                    qVar.getClass();
                    qi.q.p();
                    qi.k kVar = qVar.f43450z;
                    if (qVar.f43438m == qi.o.e && kVar != null) {
                        file2 = kVar.f43413b;
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
                public void onStateChanged(qi.p pVar) {
                    qi.o oVar = pVar.f43428a;
                    qi.o oVar2 = AudioRecorderV2Controller.this.previousState;
                    AudioRecorderV2Controller.this.previousState = oVar;
                    if (oVar == qi.o.f43423c) {
                        if (!AudioRecorderV2Controller.this.finishRequested && oVar2 == qi.o.f43422b) {
                            listener.onRecordingStarted();
                        } else if (!AudioRecorderV2Controller.this.finishRequested && oVar2 == qi.o.f43424f) {
                            listener.onRecordingResumed();
                        }
                        AudioRecorderV2Controller.this.completePendingFinish(oVar);
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
            obj.f6197f = new qi.i() {
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
            if (((qi.h) obj.d) != null) {
                if (((qi.m) obj.e) != null) {
                    this.session = new qi.q(obj);
                    return;
                }
                throw new IllegalStateException("Output listener is required");
            }
            throw new IllegalStateException("Session listener is required");
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public void completePendingFinish(qi.o oVar) {
        if (this.finishRequested) {
            if (oVar != qi.o.f43423c && oVar != qi.o.e) {
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
        qi.q qVar = this.session;
        qVar.getClass();
        qi.q.p();
        qi.n nVar = null;
        byte[] bArr = null;
        nVar = null;
        nVar = null;
        nVar = null;
        nVar = null;
        if (qVar.f43438m == qi.o.e && qVar.f43450z != null && qVar.f43443r == 0 && qVar.f43444s == qVar.j()) {
            qVar.o();
            qi.k kVar = qVar.f43450z;
            long j10 = qVar.j();
            long length = kVar.f43413b.length();
            qVar.a(kVar, length);
            synchronized (qVar.f43436k) {
                if (kVar.d && !kVar.e) {
                    kVar.e = true;
                    qVar.f43435j.execute(new qi.c(qVar, kVar, length, j10, 0));
                    File file = kVar.f43413b;
                    byte[] bArr2 = qVar.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    qVar.C = new qi.n(file, j10, bArr);
                    qVar.r(qi.o.f43425n);
                    qVar.c();
                    qVar.s();
                    qVar.l("detached_preview");
                    nVar = qVar.C;
                }
            }
        }
        if (nVar == null) {
            return false;
        }
        this.session.n();
        this.released = true;
        return true;
    }

    public void finishWhenReady() {
        this.finishRequested = true;
        qi.q qVar = this.session;
        qVar.getClass();
        qi.q.p();
        completePendingFinish(qVar.e().f43428a);
    }

    public boolean isPreviewing() {
        qi.q qVar = this.session;
        qVar.getClass();
        qi.q.p();
        if (qVar.e().f43428a == qi.o.e) {
            return true;
        }
        return false;
    }

    public void release() {
        this.session.n();
        this.released = true;
    }

    public boolean setTrimRange(long j10, long j11) {
        qi.q qVar = this.session;
        qVar.getClass();
        qi.h hVar = qVar.e;
        qi.q.p();
        if (qVar.f43438m == qi.o.e) {
            long j12 = qVar.j();
            long max = Math.max(0L, Math.min(j12, j10));
            long max2 = Math.max(max, Math.min(j12, j11));
            if (max2 - max < Math.min(qVar.f43431c, j12)) {
                return false;
            }
            qVar.f43443r = max;
            qVar.f43444s = max2;
            i2.h0 h0Var = qVar.A;
            if (h0Var != null) {
                h0Var.Z0(5, max);
            }
            hVar.onPreviewProgress(qVar.f43443r, j12);
            hVar.onStateChanged(qVar.e());
            return true;
        }
        return false;
    }

    public boolean start() {
        qi.q qVar = this.session;
        qVar.getClass();
        qi.q.p();
        if (qVar.f43438m != qi.o.f43421a) {
            return false;
        }
        File file = qVar.f43430b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            qVar.f43433g.b("start requested");
            qVar.d();
            qVar.r(qi.o.f43422b);
            qVar.t(null);
            return true;
        }
        qVar.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public boolean togglePause() {
        qi.q qVar = this.session;
        qVar.getClass();
        qi.q.p();
        qi.o oVar = qVar.e().f43428a;
        if (oVar == qi.o.f43423c) {
            return this.session.m();
        }
        qi.o oVar2 = qi.o.e;
        if (oVar == oVar2) {
            final qi.q qVar2 = this.session;
            qVar2.getClass();
            qi.q.p();
            if (qVar2.f43438m == oVar2) {
                qi.b bVar = qVar2.f43433g;
                bVar.b("resume requested: trim=" + qVar2.f43443r + ".." + qVar2.f43444s + ", sourceDurationMs=" + qVar2.j());
                qVar2.o();
                qVar2.r(qi.o.f43424f);
                final qi.k kVar = qVar2.f43450z;
                if (kVar == null) {
                    qVar2.g(new IllegalStateException("Output generation is missing"));
                    return true;
                }
                final long j10 = qVar2.f43443r;
                final long j11 = qVar2.f43444s;
                final long j12 = ((j11 - j10) * 48000) / 1000;
                qVar2.k(qi.l.f43415a);
                qVar2.f43434i.execute(new Runnable() {
                    @Override
                    public final void run() {
                        File file;
                        File file2;
                        long j13 = j12;
                        q qVar3 = q.this;
                        Handler handler = qVar3.h;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        File file3 = kVar.f43413b;
                        long j14 = j10;
                        int i10 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
                        long j15 = j11;
                        if (i10 <= 0) {
                            file = file3;
                            try {
                                if (j15 >= q.q(qVar3.f43441p)) {
                                    file2 = file;
                                    qi.b bVar2 = qVar3.f43433g;
                                    bVar2.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j14 + ".." + j15 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                                    handler.post(new qi.e(qVar3, j13, file2, 0));
                                }
                            } catch (Throwable th2) {
                                handler.post(new qi.d(qVar3, th2, 1));
                                return;
                            }
                        } else {
                            file = file3;
                        }
                        file2 = qVar3.f("trim");
                        boolean b10 = AudioRecorderNative.b(file.getAbsolutePath(), file2.getAbsolutePath(), j14, j15);
                        j15 = j15;
                        if (!b10) {
                            throw new IllegalStateException("Unable to trim Opus prefix");
                        }
                        qi.b bVar22 = qVar3.f43433g;
                        bVar22.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j14 + ".." + j15 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                        handler.post(new qi.e(qVar3, j13, file2, 0));
                    }
                });
                return true;
            }
            return false;
        }
        return false;
    }

    public class AnonymousClass2 implements qi.m {
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
        public void onOutputInvalidated(long j10, qi.l lVar) {
            File file;
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                file = (File) AudioRecorderV2Controller.this.outputFiles.remove(Long.valueOf(j10));
            }
            if (file != null) {
                AudioRecorderV2Controller.this.mainHandler.post(new q(this, j10, this.val$listener, file, 0));
            }
        }

        @Override
        public void onOutputStarted(long j10, File file) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
            AudioRecorderV2Controller.this.mainHandler.post(new q(this, j10, this.val$listener, file, 1));
        }

        @Override
        public void onOutputError(long j10, Exception exc) {
        }

        @Override
        public void onBytesAvailable(long j10, File file, long j11, long j12) {
        }
    }
}
