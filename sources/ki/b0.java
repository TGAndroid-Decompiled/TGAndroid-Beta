package ki;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.x50;
public final class b0 implements Runnable {
    public final int f13655a = 1;
    public final q0 f13656b;
    public final m0 f13657c;
    public final long d;
    public final File e;
    public final boolean f13658f;

    public b0(q0 q0Var, m0 m0Var, long j3, File file, boolean z10) {
        this.f13656b = q0Var;
        this.f13657c = m0Var;
        this.d = j3;
        this.e = file;
        this.f13658f = z10;
    }

    private final void a() {
        q0 q0Var = this.f13656b;
        m0 m0Var = this.f13657c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f13658f;
        if (m0Var.d) {
            return;
        }
        n0 n0Var = q0Var.d;
        long j10 = m0Var.f13780a;
        long length = file.length();
        r01 r01Var = (r01) n0Var;
        synchronized (r01Var) {
            p01 p01Var = (p01) r01Var.f27748c.get(Long.valueOf(j10));
            if (!r01Var.d && p01Var != null && !p01Var.e) {
                r01Var.c(p01Var);
                p01Var.f27218b = Math.max(p01Var.f27218b, length);
                p01Var.f27219c = length;
                FileLoader.getInstance(r01Var.f27746a).checkUploadNewDataAvailable(file.getAbsolutePath(), r01Var.f27747b, p01Var.f27218b, length);
            }
        }
        q0Var.h.post(new b0(q0Var, m0Var, j3, file, z10));
    }

    @Override
    public final void run() {
        q01 q01Var;
        q01 q01Var2;
        switch (this.f13655a) {
            case 0:
                a();
                return;
            default:
                q0 q0Var = this.f13656b;
                m0 m0Var = this.f13657c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f13658f;
                int i10 = q0Var.U;
                if (i10 != 10 && i10 != 9) {
                    q0Var.u(8);
                    q0Var.f13836l.b("output completed: generation=" + m0Var.f13780a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    q0Var.l("completed");
                    x50 x50Var = q0Var.f13830c;
                    long j10 = m0Var.f13780a;
                    b60 b60Var = x50Var.f30225a;
                    a60 a60Var = b60Var.S;
                    if (a60Var != null) {
                        b60Var.S = null;
                        b60Var.f22876f0 = true;
                        r01 r01Var = b60Var.Q;
                        if (r01Var == null) {
                            q01Var2 = null;
                        } else {
                            synchronized (r01Var) {
                                p01 p01Var = (p01) r01Var.f27748c.get(Long.valueOf(j10));
                                if (p01Var != null && !p01Var.e) {
                                    q01Var = new q01(Math.max(p01Var.f27219c, file.length()), p01Var.f27220f, p01Var.f27221g, p01Var.h, p01Var.f27222i);
                                }
                                q01Var = new q01(file.length(), null, null, null, null);
                            }
                            q01Var2 = q01Var;
                        }
                        VideoEditedInfo o9 = b60Var.o(file, j3, q01Var2);
                        o9.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = a60Var.f22549c;
                        photoEntry.effectId = a60Var.d;
                        b60Var.f22875f.q(photoEntry, o9, a60Var.f22547a, a60Var.f22548b, 0, false, a60Var.e);
                        r01 r01Var2 = b60Var.Q;
                        if (r01Var2 != null) {
                            r01Var2.b(false);
                        }
                        b60Var.Q = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public b0(q0 q0Var, m0 m0Var, File file, long j3, boolean z10) {
        this.f13656b = q0Var;
        this.f13657c = m0Var;
        this.e = file;
        this.d = j3;
        this.f13658f = z10;
    }
}
