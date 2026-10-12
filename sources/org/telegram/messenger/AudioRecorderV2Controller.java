package org.telegram.messenger;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.web.f2;
import pi.n;
import pi.r;
import pi.t;
public final class AudioRecorderV2Controller {
    private boolean finishRequested;
    private final Listener listener;
    private volatile boolean released;
    private final pi.t session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private r previousState = r.f45811a;

    public interface Listener {
        void onCompleted(pi.q qVar);

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
        obj.f7952c = pi.m.f45798a;
        obj.f7954f = pi.t.G;
        obj.f7950a = context;
        obj.f7951b = file;
        pi.m mVar = (pi.m) ri.e.f47798c.a();
        if (mVar != null) {
            obj.f7952c = mVar;
            obj.d = new pi.k() {
                {
                    AudioRecorderV2Controller.this = this;
                }

                @Override
                public void onCompleted(pi.q qVar) {
                    listener.onCompleted(qVar);
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
                        AudioRecorderV2Controller.this.session.j();
                        return;
                    }
                    pi.t tVar = AudioRecorderV2Controller.this.session;
                    tVar.getClass();
                    pi.t.r();
                    pi.n nVar = tVar.f45842z;
                    if (tVar.f45830m == r.f45814e && nVar != null) {
                        file2 = nVar.f45802b;
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
                public void onStateChanged(pi.s sVar) {
                    r rVar = sVar.f45819a;
                    r rVar2 = AudioRecorderV2Controller.this.previousState;
                    AudioRecorderV2Controller.this.previousState = rVar;
                    if (rVar == r.f45813c) {
                        if (!AudioRecorderV2Controller.this.finishRequested && rVar2 == r.f45812b) {
                            listener.onRecordingStarted();
                        } else if (!AudioRecorderV2Controller.this.finishRequested && rVar2 == r.f45815f) {
                            listener.onRecordingResumed();
                        }
                        AudioRecorderV2Controller.this.completePendingFinish(rVar);
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
            obj.f7954f = new pi.l() {
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
            if (((pi.k) obj.d) != null) {
                if (((pi.p) obj.f7953e) != null) {
                    this.session = new pi.t(obj);
                    return;
                }
                throw new IllegalStateException("Output listener is required");
            }
            throw new IllegalStateException("Session listener is required");
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public void completePendingFinish(r rVar) {
        if (this.finishRequested) {
            if (rVar != r.f45813c && rVar != r.f45814e) {
                return;
            }
            this.finishRequested = false;
            this.session.j();
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
        if (isPreviewing()) {
            pi.t tVar = this.session;
            if (tVar.v(0L, tVar.l())) {
                pi.t tVar2 = this.session;
                tVar2.getClass();
                pi.t.r();
                pi.q qVar = null;
                byte[] bArr = null;
                qVar = null;
                qVar = null;
                qVar = null;
                qVar = null;
                if (tVar2.f45830m == r.f45814e && tVar2.f45842z != null && tVar2.f45835r == 0 && tVar2.f45836s == tVar2.l()) {
                    tVar2.q();
                    pi.n nVar = tVar2.f45842z;
                    long l4 = tVar2.l();
                    long length = nVar.f45802b.length();
                    tVar2.a(nVar, length);
                    synchronized (tVar2.f45828k) {
                        if (nVar.d && !nVar.f45804e) {
                            nVar.f45804e = true;
                            tVar2.f45827j.execute(new pi.g(tVar2, nVar, length, l4, 2));
                            File file = nVar.f45802b;
                            byte[] bArr2 = tVar2.B;
                            if (bArr2 != null) {
                                bArr = (byte[]) bArr2.clone();
                            }
                            tVar2.C = new pi.q(file, l4, bArr);
                            tVar2.u(r.f45816n);
                            tVar2.t();
                            tVar2.n("detached_preview");
                            qVar = tVar2.C;
                        }
                    }
                }
                if (qVar == null) {
                    return false;
                }
                this.session.p();
                this.released = true;
                return true;
            }
            return false;
        }
        return false;
    }

    public void finishWhenReady() {
        this.finishRequested = true;
        pi.t tVar = this.session;
        tVar.getClass();
        pi.t.r();
        completePendingFinish(tVar.d().f45819a);
    }

    public boolean isPreviewing() {
        pi.t tVar = this.session;
        tVar.getClass();
        pi.t.r();
        if (tVar.d().f45819a == r.f45814e) {
            return true;
        }
        return false;
    }

    public void release() {
        this.session.p();
        this.released = true;
    }

    public boolean restorePreview(final File file, long j3) {
        final pi.t tVar = this.session;
        tVar.getClass();
        pi.t.r();
        if (tVar.f45830m == r.f45811a && j3 > 0 && file.isFile() && file.length() != 0 && tVar.f()) {
            final pi.n c10 = tVar.c();
            tVar.f45833p = (j3 * 48000) / 1000;
            tVar.f45835r = 0L;
            tVar.f45836s = tVar.l();
            tVar.u(r.d);
            tVar.f45826i.execute(new Runnable() {
                @Override
                public final void run() {
                    File file2 = file;
                    n nVar = c10;
                    File file3 = nVar.f45802b;
                    t tVar2 = t.this;
                    Handler handler = tVar2.h;
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        try {
                            byte[] bArr = new byte[32768];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read != -1) {
                                    fileOutputStream.write(bArr, 0, read);
                                } else {
                                    fileOutputStream.close();
                                    fileInputStream.close();
                                    handler.post(new pi.f(tVar2, nVar, AudioRecorderNative.e(file3.getAbsolutePath()), 0));
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Exception e7) {
                        handler.post(new f2(4, tVar2, e7));
                    }
                }
            });
            return true;
        }
        return false;
    }

    public boolean setTrimRange(long j3, long j10) {
        return this.session.v(j3, j10);
    }

    public boolean start() {
        pi.t tVar = this.session;
        tVar.getClass();
        pi.t.r();
        if (tVar.f45830m != r.f45811a || !tVar.f()) {
            return false;
        }
        tVar.f45825g.b("start requested");
        tVar.c();
        tVar.u(r.f45812b);
        tVar.w(null);
        return true;
    }

    public boolean togglePause() {
        pi.t tVar = this.session;
        tVar.getClass();
        pi.t.r();
        r rVar = tVar.d().f45819a;
        if (rVar == r.f45813c) {
            return this.session.o();
        }
        r rVar2 = r.f45814e;
        if (rVar == rVar2) {
            final pi.t tVar2 = this.session;
            tVar2.getClass();
            pi.t.r();
            if (tVar2.f45830m == rVar2) {
                pi.b bVar = tVar2.f45825g;
                bVar.b("resume requested: trim=" + tVar2.f45835r + ".." + tVar2.f45836s + ", sourceDurationMs=" + tVar2.l());
                tVar2.q();
                tVar2.u(r.f45815f);
                final pi.n nVar = tVar2.f45842z;
                if (nVar == null) {
                    tVar2.i(new IllegalStateException("Output generation is missing"));
                    return true;
                }
                final long j3 = tVar2.f45835r;
                final long j10 = tVar2.f45836s;
                final long j11 = ((j10 - j3) * 48000) / 1000;
                tVar2.m(pi.o.f45805a);
                tVar2.f45826i.execute(new Runnable() {
                    @Override
                    public final void run() {
                        File file;
                        File file2;
                        long j12 = j11;
                        t tVar3 = t.this;
                        Handler handler = tVar3.h;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        File file3 = nVar.f45802b;
                        long j13 = j3;
                        int i10 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                        long j14 = j10;
                        if (i10 <= 0) {
                            file = file3;
                            try {
                                if (j14 >= t.s(tVar3.f45833p)) {
                                    file2 = file;
                                    pi.b bVar2 = tVar3.f45825g;
                                    bVar2.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j13 + ".." + j14 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                                    handler.post(new pi.d(tVar3, j12, file2, 0));
                                }
                            } catch (Throwable th2) {
                                handler.post(new pi.e(tVar3, th2, 0));
                                return;
                            }
                        } else {
                            file = file3;
                        }
                        file2 = tVar3.e("trim");
                        boolean b10 = AudioRecorderNative.b(file.getAbsolutePath(), file2.getAbsolutePath(), j13, j14);
                        j14 = j14;
                        if (!b10) {
                            throw new IllegalStateException("Unable to trim Opus prefix");
                        }
                        pi.b bVar22 = tVar3.f45825g;
                        bVar22.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j13 + ".." + j14 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                        handler.post(new pi.d(tVar3, j12, file2, 0));
                    }
                });
                return true;
            }
            return false;
        }
        return false;
    }

    public class AnonymousClass2 implements pi.p {
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
        public void onOutputInvalidated(long j3, pi.o oVar) {
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
