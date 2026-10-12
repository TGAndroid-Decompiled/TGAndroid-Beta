package org.telegram.messenger;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import ri.q;
public final class AudioRecorderV2Controller {
    private boolean finishRequested;
    private final Listener listener;
    private boolean released;
    private final ri.q session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private ri.o previousState = ri.o.f44745a;

    public interface Listener {
        void onCompleted(ri.n nVar);

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
        obj.f6193c = ri.j.f44733a;
        obj.f6194f = ri.q.G;
        obj.f6191a = context;
        obj.f6192b = file;
        ri.j jVar = (ri.j) si.e.f45486c.a();
        if (jVar != null) {
            obj.f6193c = jVar;
            obj.d = new ri.h() {
                {
                    AudioRecorderV2Controller.this = this;
                }

                @Override
                public void onCompleted(ri.n nVar) {
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
                    ri.q qVar = AudioRecorderV2Controller.this.session;
                    qVar.getClass();
                    ri.q.p();
                    ri.k kVar = qVar.f44774z;
                    if (qVar.f44762m == ri.o.e && kVar != null) {
                        file2 = kVar.f44737b;
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
                public void onStateChanged(ri.p pVar) {
                    ri.o oVar = pVar.f44752a;
                    ri.o oVar2 = AudioRecorderV2Controller.this.previousState;
                    AudioRecorderV2Controller.this.previousState = oVar;
                    if (oVar == ri.o.f44747c) {
                        if (!AudioRecorderV2Controller.this.finishRequested && oVar2 == ri.o.f44746b) {
                            listener.onRecordingStarted();
                        } else if (!AudioRecorderV2Controller.this.finishRequested && oVar2 == ri.o.f44748f) {
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
            obj.f6194f = new ri.i() {
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
            if (((ri.h) obj.d) != null) {
                if (((ri.m) obj.e) != null) {
                    this.session = new ri.q(obj);
                    return;
                }
                throw new IllegalStateException("Output listener is required");
            }
            throw new IllegalStateException("Session listener is required");
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public void completePendingFinish(ri.o oVar) {
        if (this.finishRequested) {
            if (oVar != ri.o.f44747c && oVar != ri.o.e) {
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
        ri.q qVar = this.session;
        qVar.getClass();
        ri.q.p();
        ri.n nVar = null;
        byte[] bArr = null;
        nVar = null;
        nVar = null;
        nVar = null;
        nVar = null;
        if (qVar.f44762m == ri.o.e && qVar.f44774z != null && qVar.f44767r == 0 && qVar.f44768s == qVar.j()) {
            qVar.o();
            ri.k kVar = qVar.f44774z;
            long j10 = qVar.j();
            long length = kVar.f44737b.length();
            qVar.a(kVar, length);
            synchronized (qVar.f44760k) {
                if (kVar.d && !kVar.e) {
                    kVar.e = true;
                    qVar.f44759j.execute(new ri.c(qVar, kVar, length, j10, 0));
                    File file = kVar.f44737b;
                    byte[] bArr2 = qVar.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    qVar.C = new ri.n(file, j10, bArr);
                    qVar.r(ri.o.f44749n);
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
        ri.q qVar = this.session;
        qVar.getClass();
        ri.q.p();
        completePendingFinish(qVar.e().f44752a);
    }

    public boolean isPreviewing() {
        ri.q qVar = this.session;
        qVar.getClass();
        ri.q.p();
        if (qVar.e().f44752a == ri.o.e) {
            return true;
        }
        return false;
    }

    public void release() {
        this.session.n();
        this.released = true;
    }

    public boolean setTrimRange(long j10, long j11) {
        ri.q qVar = this.session;
        qVar.getClass();
        ri.h hVar = qVar.e;
        ri.q.p();
        if (qVar.f44762m == ri.o.e) {
            long j12 = qVar.j();
            long max = Math.max(0L, Math.min(j12, j10));
            long max2 = Math.max(max, Math.min(j12, j11));
            if (max2 - max < Math.min(qVar.f44755c, j12)) {
                return false;
            }
            qVar.f44767r = max;
            qVar.f44768s = max2;
            i2.h0 h0Var = qVar.A;
            if (h0Var != null) {
                h0Var.Z0(5, max);
            }
            hVar.onPreviewProgress(qVar.f44767r, j12);
            hVar.onStateChanged(qVar.e());
            return true;
        }
        return false;
    }

    public boolean start() {
        ri.q qVar = this.session;
        qVar.getClass();
        ri.q.p();
        if (qVar.f44762m != ri.o.f44745a) {
            return false;
        }
        File file = qVar.f44754b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            qVar.f44757g.b("start requested");
            qVar.d();
            qVar.r(ri.o.f44746b);
            qVar.t(null);
            return true;
        }
        qVar.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public boolean togglePause() {
        ri.q qVar = this.session;
        qVar.getClass();
        ri.q.p();
        ri.o oVar = qVar.e().f44752a;
        if (oVar == ri.o.f44747c) {
            return this.session.m();
        }
        ri.o oVar2 = ri.o.e;
        if (oVar == oVar2) {
            final ri.q qVar2 = this.session;
            qVar2.getClass();
            ri.q.p();
            if (qVar2.f44762m == oVar2) {
                ri.b bVar = qVar2.f44757g;
                bVar.b("resume requested: trim=" + qVar2.f44767r + ".." + qVar2.f44768s + ", sourceDurationMs=" + qVar2.j());
                qVar2.o();
                qVar2.r(ri.o.f44748f);
                final ri.k kVar = qVar2.f44774z;
                if (kVar == null) {
                    qVar2.g(new IllegalStateException("Output generation is missing"));
                    return true;
                }
                final long j10 = qVar2.f44767r;
                final long j11 = qVar2.f44768s;
                final long j12 = ((j11 - j10) * 48000) / 1000;
                qVar2.k(ri.l.f44739a);
                qVar2.f44758i.execute(new Runnable() {
                    @Override
                    public final void run() {
                        File file;
                        File file2;
                        long j13 = j12;
                        q qVar3 = q.this;
                        Handler handler = qVar3.h;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        File file3 = kVar.f44737b;
                        long j14 = j10;
                        int i10 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
                        long j15 = j11;
                        if (i10 <= 0) {
                            file = file3;
                            try {
                                if (j15 >= q.q(qVar3.f44765p)) {
                                    file2 = file;
                                    ri.b bVar2 = qVar3.f44757g;
                                    bVar2.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j14 + ".." + j15 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                                    handler.post(new ri.e(qVar3, j13, file2, 0));
                                }
                            } catch (Throwable th2) {
                                handler.post(new ri.d(qVar3, th2, 1));
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
                        ri.b bVar22 = qVar3.f44757g;
                        bVar22.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j14 + ".." + j15 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                        handler.post(new ri.e(qVar3, j13, file2, 0));
                    }
                });
                return true;
            }
            return false;
        }
        return false;
    }

    public class AnonymousClass2 implements ri.m {
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
        public void onOutputInvalidated(long j10, ri.l lVar) {
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
