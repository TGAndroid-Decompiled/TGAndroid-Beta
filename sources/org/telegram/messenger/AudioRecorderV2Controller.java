package org.telegram.messenger;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import pi.r;
import pi.s;
public final class AudioRecorderV2Controller {
    private boolean finishRequested;
    private final Listener listener;
    private volatile boolean released;
    private final pi.s session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private pi.q previousState = pi.q.f45803a;

    public interface Listener {
        void onCompleted(pi.p pVar);

        void onError(Exception exc);

        void onOutputInvalidated(File file);

        void onOutputStarted(File file);

        void onPreviewReady(long j3, File file, byte[] bArr);

        void onRecordingProgress(long j3, double d);

        void onRecordingResumed();

        void onRecordingStarted();

        void onRecordingTooShort(long j3);
    }

    public AudioRecorderV2Controller(Context context, File file, final Listener listener) {
        this.listener = listener;
        ?? obj = new Object();
        obj.f7952c = pi.l.f45790a;
        obj.f7954f = pi.s.G;
        obj.f7950a = context;
        obj.f7951b = file;
        pi.l lVar = (pi.l) ri.e.f47790c.a();
        if (lVar != null) {
            obj.f7952c = lVar;
            obj.d = new pi.j() {
                {
                    AudioRecorderV2Controller.this = this;
                }

                @Override
                public void onCompleted(pi.p pVar) {
                    listener.onCompleted(pVar);
                }

                @Override
                public void onError(Exception exc) {
                    listener.onError(exc);
                }

                @Override
                public void onPreviewReady(long j3, long j10, long j11, byte[] bArr) {
                    File file2;
                    if (AudioRecorderV2Controller.this.finishRequested) {
                        AudioRecorderV2Controller.this.finishRequested = false;
                        AudioRecorderV2Controller.this.session.h();
                        return;
                    }
                    pi.s sVar = AudioRecorderV2Controller.this.session;
                    sVar.getClass();
                    pi.s.p();
                    pi.m mVar = sVar.f45834z;
                    if (sVar.f45822m == pi.q.f45806e && mVar != null) {
                        file2 = mVar.f45794b;
                    } else {
                        file2 = null;
                    }
                    if (file2 == null) {
                        listener.onError(new IllegalStateException("Preview file is unavailable"));
                    } else {
                        listener.onPreviewReady(j3, file2, bArr);
                    }
                }

                @Override
                public void onRecordingProgress(long j3, double d) {
                    listener.onRecordingProgress(j3, d);
                }

                @Override
                public void onRecordingTooShort(long j3) {
                    listener.onRecordingTooShort(j3);
                }

                @Override
                public void onStateChanged(r rVar) {
                    pi.q qVar = rVar.f45811a;
                    pi.q qVar2 = AudioRecorderV2Controller.this.previousState;
                    AudioRecorderV2Controller.this.previousState = qVar;
                    if (qVar == pi.q.f45805c) {
                        if (!AudioRecorderV2Controller.this.finishRequested && qVar2 == pi.q.f45804b) {
                            listener.onRecordingStarted();
                        } else if (!AudioRecorderV2Controller.this.finishRequested && qVar2 == pi.q.f45807f) {
                            listener.onRecordingResumed();
                        }
                        AudioRecorderV2Controller.this.completePendingFinish(qVar);
                    }
                }

                @Override
                public void onMaximumDurationReached() {
                }

                @Override
                public void onPreviewPlaybackChanged(boolean z10) {
                }

                @Override
                public void onPreviewProgress(long j3, long j10) {
                }
            };
            obj.f7953e = new AnonymousClass2(listener);
            obj.f7954f = new pi.k() {
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
            if (((pi.j) obj.d) != null) {
                if (((pi.o) obj.f7953e) != null) {
                    this.session = new pi.s(obj);
                    return;
                }
                throw new IllegalStateException("Output listener is required");
            }
            throw new IllegalStateException("Session listener is required");
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public void completePendingFinish(pi.q qVar) {
        if (this.finishRequested) {
            if (qVar != pi.q.f45805c && qVar != pi.q.f45806e) {
                return;
            }
            this.finishRequested = false;
            this.session.h();
        }
    }

    public static void lambda$runOnMainThreadAndWait$0(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public void runOnMainThreadAndWait(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!this.mainHandler.post(new q(0, runnable, countDownLatch))) {
            FileLog.e("AudioRecorderV2 unable to dispatch output event");
            return;
        }
        try {
            if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                FileLog.e("AudioRecorderV2 output event timed out");
            }
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            FileLog.e(e7);
        }
    }

    public void cancel() {
        this.finishRequested = false;
        this.session.b();
    }

    public boolean detachPreviewOutput() {
        pi.s sVar = this.session;
        sVar.getClass();
        pi.s.p();
        pi.p pVar = null;
        byte[] bArr = null;
        pVar = null;
        pVar = null;
        pVar = null;
        pVar = null;
        if (sVar.f45822m == pi.q.f45806e && sVar.f45834z != null && sVar.f45827r == 0 && sVar.f45828s == sVar.j()) {
            sVar.o();
            pi.m mVar = sVar.f45834z;
            long j3 = sVar.j();
            long length = mVar.f45794b.length();
            sVar.a(mVar, length);
            synchronized (sVar.f45820k) {
                if (mVar.d && !mVar.f45796e) {
                    mVar.f45796e = true;
                    sVar.f45819j.execute(new pi.e(sVar, mVar, length, j3, 1));
                    File file = mVar.f45794b;
                    byte[] bArr2 = sVar.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    sVar.C = new pi.p(file, j3, bArr);
                    sVar.s(pi.q.f45808n);
                    sVar.r();
                    sVar.l("detached_preview");
                    pVar = sVar.C;
                }
            }
        }
        if (pVar == null) {
            return false;
        }
        this.session.n();
        this.released = true;
        return true;
    }

    public void finishWhenReady() {
        this.finishRequested = true;
        pi.s sVar = this.session;
        sVar.getClass();
        pi.s.p();
        completePendingFinish(sVar.d().f45811a);
    }

    public boolean isPreviewing() {
        pi.s sVar = this.session;
        sVar.getClass();
        pi.s.p();
        if (sVar.d().f45811a == pi.q.f45806e) {
            return true;
        }
        return false;
    }

    public void release() {
        this.session.n();
        this.released = true;
    }

    public boolean setTrimRange(long j3, long j10) {
        pi.s sVar = this.session;
        sVar.getClass();
        pi.j jVar = sVar.f45815e;
        pi.s.p();
        if (sVar.f45822m == pi.q.f45806e) {
            long j11 = sVar.j();
            long max = Math.max(0L, Math.min(j11, j3));
            long max2 = Math.max(max, Math.min(j11, j10));
            if (max2 - max < Math.min(sVar.f45814c, j11)) {
                return false;
            }
            sVar.f45827r = max;
            sVar.f45828s = max2;
            i2.f0 f0Var = sVar.A;
            if (f0Var != null) {
                f0Var.W0(5, max);
            }
            jVar.onPreviewProgress(sVar.f45827r, j11);
            jVar.onStateChanged(sVar.d());
            return true;
        }
        return false;
    }

    public boolean start() {
        pi.s sVar = this.session;
        sVar.getClass();
        pi.s.p();
        if (sVar.f45822m != pi.q.f45803a) {
            return false;
        }
        File file = sVar.f45813b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            sVar.f45817g.b("start requested");
            sVar.c();
            sVar.s(pi.q.f45804b);
            sVar.t(null);
            return true;
        }
        sVar.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public boolean togglePause() {
        pi.s sVar = this.session;
        sVar.getClass();
        pi.s.p();
        pi.q qVar = sVar.d().f45811a;
        if (qVar == pi.q.f45805c) {
            return this.session.m();
        }
        pi.q qVar2 = pi.q.f45806e;
        if (qVar == qVar2) {
            final pi.s sVar2 = this.session;
            sVar2.getClass();
            pi.s.p();
            if (sVar2.f45822m == qVar2) {
                pi.b bVar = sVar2.f45817g;
                bVar.b("resume requested: trim=" + sVar2.f45827r + ".." + sVar2.f45828s + ", sourceDurationMs=" + sVar2.j());
                sVar2.o();
                sVar2.s(pi.q.f45807f);
                final pi.m mVar = sVar2.f45834z;
                if (mVar == null) {
                    sVar2.g(new IllegalStateException("Output generation is missing"));
                    return true;
                }
                final long j3 = sVar2.f45827r;
                final long j10 = sVar2.f45828s;
                final long j11 = ((j10 - j3) * 48000) / 1000;
                sVar2.k(pi.n.f45797a);
                sVar2.f45818i.execute(new Runnable() {
                    @Override
                    public final void run() {
                        File file;
                        File file2;
                        long j12 = j11;
                        s sVar3 = s.this;
                        Handler handler = sVar3.h;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        File file3 = mVar.f45794b;
                        long j13 = j3;
                        int i10 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                        long j14 = j10;
                        if (i10 <= 0) {
                            file = file3;
                            try {
                                if (j14 >= s.q(sVar3.f45825p)) {
                                    file2 = file;
                                    pi.b bVar2 = sVar3.f45817g;
                                    bVar2.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j13 + ".." + j14 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                                    handler.post(new pi.f(sVar3, j12, file2, 0));
                                }
                            } catch (Throwable th2) {
                                handler.post(new pi.d(sVar3, th2, 1));
                                return;
                            }
                        } else {
                            file = file3;
                        }
                        file2 = sVar3.e("trim");
                        boolean b10 = AudioRecorderNative.b(file.getAbsolutePath(), file2.getAbsolutePath(), j13, j14);
                        j14 = j14;
                        if (!b10) {
                            throw new IllegalStateException("Unable to trim Opus prefix");
                        }
                        pi.b bVar22 = sVar3.f45817g;
                        bVar22.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j13 + ".." + j14 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                        handler.post(new pi.f(sVar3, j12, file2, 0));
                    }
                });
                return true;
            }
            return false;
        }
        return false;
    }

    public class AnonymousClass2 implements pi.o {
        final Listener val$listener;

        public AnonymousClass2(Listener listener) {
            AudioRecorderV2Controller.this = r1;
            this.val$listener = listener;
        }

        public void lambda$onOutputInvalidated$1(long j3, Listener listener, File file) {
            if (AudioRecorderV2Controller.this.deliveredOutputIds.remove(Long.valueOf(j3))) {
                listener.onOutputInvalidated(file);
            }
        }

        public void lambda$onOutputStarted$0(long j3, Listener listener, File file) {
            if (AudioRecorderV2Controller.this.released) {
                return;
            }
            AudioRecorderV2Controller.this.deliveredOutputIds.add(Long.valueOf(j3));
            listener.onOutputStarted(file);
        }

        @Override
        public void onOutputCompleted(long j3, File file, long j10, long j11) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j3), file);
            }
        }

        @Override
        public void onOutputInvalidated(long j3, pi.n nVar) {
            File file;
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                file = (File) AudioRecorderV2Controller.this.outputFiles.remove(Long.valueOf(j3));
            }
            if (file != null) {
                AudioRecorderV2Controller.this.runOnMainThreadAndWait(new s(this, j3, this.val$listener, file, 0));
            }
        }

        @Override
        public void onOutputStarted(long j3, File file) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j3), file);
            }
            AudioRecorderV2Controller.this.runOnMainThreadAndWait(new s(this, j3, this.val$listener, file, 1));
        }

        @Override
        public void onOutputError(long j3, Exception exc) {
        }

        @Override
        public void onBytesAvailable(long j3, File file, long j10, long j11) {
        }
    }
}
