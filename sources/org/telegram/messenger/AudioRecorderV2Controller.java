package org.telegram.messenger;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
public final class AudioRecorderV2Controller {
    private boolean finishRequested;
    private final Listener listener;
    private boolean released;
    private final ui.o session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private ui.m previousState = ui.m.f49941a;

    public interface Listener {
        void onCompleted(ui.l lVar);

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
        di.p4 p4Var = new di.p4(context, 2);
        p4Var.f8902c = file;
        ui.h hVar = (ui.h) wi.e.f51278c.a();
        if (hVar != null) {
            p4Var.d = hVar;
            p4Var.f8900a = false;
            p4Var.e = new ui.f() {
                {
                    AudioRecorderV2Controller.this = this;
                }

                @Override
                public void onCompleted(ui.l lVar) {
                    listener.onCompleted(lVar);
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
                    ui.o oVar = AudioRecorderV2Controller.this.session;
                    oVar.getClass();
                    ui.o.p();
                    ui.i iVar = oVar.A;
                    if (oVar.f49959n == ui.m.e && iVar != null) {
                        file2 = iVar.f49933b;
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
                public void onStateChanged(ui.n nVar) {
                    ui.m mVar = nVar.f49948a;
                    ui.m mVar2 = AudioRecorderV2Controller.this.previousState;
                    AudioRecorderV2Controller.this.previousState = mVar;
                    if (mVar == ui.m.f49943c) {
                        if (!AudioRecorderV2Controller.this.finishRequested && mVar2 == ui.m.f49942b) {
                            listener.onRecordingStarted();
                        } else if (!AudioRecorderV2Controller.this.finishRequested && mVar2 == ui.m.f49944f) {
                            listener.onRecordingResumed();
                        }
                        AudioRecorderV2Controller.this.completePendingFinish(mVar);
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
            p4Var.f8903f = new AnonymousClass2(listener);
            p4Var.f8904g = new ui.g() {
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
            if (((ui.f) p4Var.e) != null) {
                if (((ui.k) p4Var.f8903f) != null) {
                    this.session = new ui.o(p4Var);
                    return;
                }
                throw new IllegalStateException("Output listener is required");
            }
            throw new IllegalStateException("Session listener is required");
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public void completePendingFinish(ui.m mVar) {
        if (this.finishRequested) {
            if (mVar != ui.m.f49943c && mVar != ui.m.e) {
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
        ui.o oVar = this.session;
        oVar.getClass();
        ui.o.p();
        ui.l lVar = null;
        byte[] bArr = null;
        lVar = null;
        lVar = null;
        lVar = null;
        lVar = null;
        if (oVar.f49959n == ui.m.e && oVar.A != null && oVar.f49964s == 0 && oVar.f49965t == oVar.j()) {
            oVar.o();
            ui.i iVar = oVar.A;
            long j10 = oVar.j();
            long length = iVar.f49933b.length();
            oVar.a(iVar, length);
            synchronized (oVar.f49957l) {
                if (iVar.d && !iVar.e) {
                    iVar.e = true;
                    oVar.f49956k.execute(new ui.c(oVar, iVar, length, j10, 0));
                    File file = iVar.f49933b;
                    byte[] bArr2 = oVar.C;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    oVar.D = new ui.l(file, j10, bArr);
                    oVar.r(ui.m.f49945n);
                    oVar.c();
                    oVar.s();
                    oVar.l("detached_preview");
                    lVar = oVar.D;
                }
            }
        }
        if (lVar == null) {
            return false;
        }
        this.session.n();
        this.released = true;
        return true;
    }

    public void finishWhenReady() {
        this.finishRequested = true;
        ui.o oVar = this.session;
        oVar.getClass();
        ui.o.p();
        completePendingFinish(oVar.e().f49948a);
    }

    public boolean isPreviewing() {
        ui.o oVar = this.session;
        oVar.getClass();
        ui.o.p();
        if (oVar.e().f49948a == ui.m.e) {
            return true;
        }
        return false;
    }

    public void release() {
        this.session.n();
        this.released = true;
    }

    public boolean setTrimRange(long j10, long j11) {
        ui.o oVar = this.session;
        oVar.getClass();
        ui.f fVar = oVar.f49952f;
        ui.o.p();
        if (oVar.f49959n == ui.m.e) {
            long j12 = oVar.j();
            long max = Math.max(0L, Math.min(j12, j10));
            long max2 = Math.max(max, Math.min(j12, j11));
            if (max2 - max < Math.min(oVar.f49951c, j12)) {
                return false;
            }
            oVar.f49964s = max;
            oVar.f49965t = max2;
            i2.j0 j0Var = oVar.B;
            if (j0Var != null) {
                j0Var.Z0(5, max);
            }
            fVar.onPreviewProgress(oVar.f49964s, j12);
            fVar.onStateChanged(oVar.e());
            return true;
        }
        return false;
    }

    public boolean start() {
        ui.o oVar = this.session;
        oVar.getClass();
        ui.o.p();
        if (oVar.f49959n != ui.m.f49941a) {
            return false;
        }
        File file = oVar.f49950b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            oVar.h.b("start requested");
            oVar.d();
            oVar.r(ui.m.f49942b);
            oVar.t(0L, -1L, null);
            return true;
        }
        oVar.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public boolean togglePause() {
        ui.o oVar = this.session;
        oVar.getClass();
        ui.o.p();
        ui.m mVar = oVar.e().f49948a;
        if (mVar == ui.m.f49943c) {
            return this.session.m();
        }
        ui.m mVar2 = ui.m.e;
        boolean z10 = false;
        if (mVar == mVar2) {
            ui.o oVar2 = this.session;
            oVar2.getClass();
            ui.o.p();
            if (oVar2.f49959n == mVar2) {
                oVar2.h.b("resume requested: trim=" + oVar2.f49964s + ".." + oVar2.f49965t + ", sourceDurationMs=" + oVar2.j());
                oVar2.o();
                oVar2.r(ui.m.f49944f);
                ui.i iVar = oVar2.A;
                if (iVar == null) {
                    oVar2.g(new IllegalStateException("Output generation is missing"));
                    return true;
                }
                long j10 = oVar2.f49964s;
                long j11 = oVar2.f49965t;
                if (j11 >= ui.o.q(oVar2.f49962q)) {
                    z10 = true;
                }
                oVar2.k(ui.j.f49935a);
                long j12 = ((j11 - j10) * 48000) / 1000;
                oVar2.f49962q = j12;
                oVar2.f49964s = 0L;
                oVar2.f49965t = ui.o.q(j12);
                oVar2.d();
                oVar2.h.b("resume prefix selected: source=" + iVar.f49933b.getName() + ", trim=" + j10 + ".." + j11);
                File file = iVar.f49933b;
                if (z10) {
                    j11 = -1;
                }
                oVar2.t(j10, j11, file);
                return true;
            }
        }
        return false;
    }

    public class AnonymousClass2 implements ui.k {
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
        public void onOutputInvalidated(long j10, ui.j jVar) {
            File file;
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                file = (File) AudioRecorderV2Controller.this.outputFiles.remove(Long.valueOf(j10));
            }
            if (file != null) {
                AudioRecorderV2Controller.this.mainHandler.post(new u(this, j10, this.val$listener, file, 0));
            }
        }

        @Override
        public void onOutputStarted(long j10, File file) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
            AudioRecorderV2Controller.this.mainHandler.post(new u(this, j10, this.val$listener, file, 1));
        }

        @Override
        public void onOutputError(long j10, Exception exc) {
        }

        @Override
        public void onBytesAvailable(long j10, File file, long j11, long j12) {
        }
    }
}
