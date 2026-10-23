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
    private final ri.o session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private ri.m previousState = ri.m.f46249a;

    public interface Listener {
        void onCompleted(ri.l lVar);

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
        ci.o4 o4Var = new ci.o4(context, 2);
        o4Var.f5633c = file;
        ri.h hVar = (ri.h) ti.e.f47660c.a();
        if (hVar != null) {
            o4Var.d = hVar;
            o4Var.f5631a = false;
            o4Var.e = new ri.f() {
                {
                    AudioRecorderV2Controller.this = this;
                }

                @Override
                public void onCompleted(ri.l lVar) {
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
                    ri.o oVar = AudioRecorderV2Controller.this.session;
                    oVar.getClass();
                    ri.o.p();
                    ri.i iVar = oVar.A;
                    if (oVar.f46267n == ri.m.e && iVar != null) {
                        file2 = iVar.f46241b;
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
                public void onStateChanged(ri.n nVar) {
                    ri.m mVar = nVar.f46256a;
                    ri.m mVar2 = AudioRecorderV2Controller.this.previousState;
                    AudioRecorderV2Controller.this.previousState = mVar;
                    if (mVar == ri.m.f46251c) {
                        if (!AudioRecorderV2Controller.this.finishRequested && mVar2 == ri.m.f46250b) {
                            listener.onRecordingStarted();
                        } else if (!AudioRecorderV2Controller.this.finishRequested && mVar2 == ri.m.f46252f) {
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
            o4Var.f5634f = new AnonymousClass2(listener);
            o4Var.f5635g = new ri.g() {
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
            if (((ri.f) o4Var.e) != null) {
                if (((ri.k) o4Var.f5634f) != null) {
                    this.session = new ri.o(o4Var);
                    return;
                }
                throw new IllegalStateException("Output listener is required");
            }
            throw new IllegalStateException("Session listener is required");
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public void completePendingFinish(ri.m mVar) {
        if (this.finishRequested) {
            if (mVar != ri.m.f46251c && mVar != ri.m.e) {
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
        ri.o oVar = this.session;
        oVar.getClass();
        ri.o.p();
        ri.l lVar = null;
        byte[] bArr = null;
        lVar = null;
        lVar = null;
        lVar = null;
        lVar = null;
        if (oVar.f46267n == ri.m.e && oVar.A != null && oVar.f46272s == 0 && oVar.f46273t == oVar.j()) {
            oVar.o();
            ri.i iVar = oVar.A;
            long j10 = oVar.j();
            long length = iVar.f46241b.length();
            oVar.a(iVar, length);
            synchronized (oVar.f46265l) {
                if (iVar.d && !iVar.e) {
                    iVar.e = true;
                    oVar.f46264k.execute(new ri.c(oVar, iVar, length, j10, 0));
                    File file = iVar.f46241b;
                    byte[] bArr2 = oVar.C;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    oVar.D = new ri.l(file, j10, bArr);
                    oVar.r(ri.m.f46253n);
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
        ri.o oVar = this.session;
        oVar.getClass();
        ri.o.p();
        completePendingFinish(oVar.e().f46256a);
    }

    public boolean isPreviewing() {
        ri.o oVar = this.session;
        oVar.getClass();
        ri.o.p();
        if (oVar.e().f46256a == ri.m.e) {
            return true;
        }
        return false;
    }

    public void release() {
        this.session.n();
        this.released = true;
    }

    public boolean setTrimRange(long j10, long j11) {
        ri.o oVar = this.session;
        oVar.getClass();
        ri.f fVar = oVar.f46260f;
        ri.o.p();
        if (oVar.f46267n == ri.m.e) {
            long j12 = oVar.j();
            long max = Math.max(0L, Math.min(j12, j10));
            long max2 = Math.max(max, Math.min(j12, j11));
            if (max2 - max < Math.min(oVar.f46259c, j12)) {
                return false;
            }
            oVar.f46272s = max;
            oVar.f46273t = max2;
            i2.h0 h0Var = oVar.B;
            if (h0Var != null) {
                h0Var.Z0(5, max);
            }
            fVar.onPreviewProgress(oVar.f46272s, j12);
            fVar.onStateChanged(oVar.e());
            return true;
        }
        return false;
    }

    public boolean start() {
        ri.o oVar = this.session;
        oVar.getClass();
        ri.o.p();
        if (oVar.f46267n != ri.m.f46249a) {
            return false;
        }
        File file = oVar.f46258b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            oVar.h.b("start requested");
            oVar.d();
            oVar.r(ri.m.f46250b);
            oVar.t(0L, -1L, null);
            return true;
        }
        oVar.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public boolean togglePause() {
        ri.o oVar = this.session;
        oVar.getClass();
        ri.o.p();
        ri.m mVar = oVar.e().f46256a;
        if (mVar == ri.m.f46251c) {
            return this.session.m();
        }
        ri.m mVar2 = ri.m.e;
        boolean z10 = false;
        if (mVar == mVar2) {
            ri.o oVar2 = this.session;
            oVar2.getClass();
            ri.o.p();
            if (oVar2.f46267n == mVar2) {
                oVar2.h.b("resume requested: trim=" + oVar2.f46272s + ".." + oVar2.f46273t + ", sourceDurationMs=" + oVar2.j());
                oVar2.o();
                oVar2.r(ri.m.f46252f);
                ri.i iVar = oVar2.A;
                if (iVar == null) {
                    oVar2.g(new IllegalStateException("Output generation is missing"));
                    return true;
                }
                long j10 = oVar2.f46272s;
                long j11 = oVar2.f46273t;
                if (j11 >= ri.o.q(oVar2.f46270q)) {
                    z10 = true;
                }
                oVar2.k(ri.j.f46243a);
                long j12 = ((j11 - j10) * 48000) / 1000;
                oVar2.f46270q = j12;
                oVar2.f46272s = 0L;
                oVar2.f46273t = ri.o.q(j12);
                oVar2.d();
                oVar2.h.b("resume prefix selected: source=" + iVar.f46241b.getName() + ", trim=" + j10 + ".." + j11);
                File file = iVar.f46241b;
                if (z10) {
                    j11 = -1;
                }
                oVar2.t(j10, j11, file);
                return true;
            }
        }
        return false;
    }

    public class AnonymousClass2 implements ri.k {
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
        public void onOutputInvalidated(long j10, ri.j jVar) {
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
