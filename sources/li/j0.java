package li;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.o60;
public final class j0 implements Runnable {
    public final int f14815a = 1;
    public final u0 f14816b;
    public final q0 f14817c;
    public final long d;
    public final File e;
    public final boolean f14818f;

    public j0(u0 u0Var, q0 q0Var, long j10, File file, boolean z10) {
        this.f14816b = u0Var;
        this.f14817c = q0Var;
        this.d = j10;
        this.e = file;
        this.f14818f = z10;
    }

    private final void a() {
        u0 u0Var = this.f14816b;
        q0 q0Var = this.f14817c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f14818f;
        synchronized (u0Var.f15010g) {
            if (!u0Var.D && !q0Var.d && !q0Var.e) {
                q0Var.e = true;
                ((c11) u0Var.e).b(q0Var.f14945a, file.length(), file);
                u0Var.f15011i.post(new j0(u0Var, q0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        b11 b11Var;
        b11 b11Var2;
        switch (this.f14815a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.f14816b;
                q0 q0Var = this.f14817c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f14818f;
                int i10 = u0Var.W;
                if (i10 != 10 && i10 != 9) {
                    u0Var.v(8);
                    u0Var.f15015m.b("output completed: generation=" + q0Var.f14945a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    u0Var.m("completed");
                    l2.f fVar = u0Var.d;
                    long j11 = q0Var.f14945a;
                    o60 o60Var = (o60) fVar.f14503b;
                    n60 n60Var = o60Var.V;
                    if (n60Var != null) {
                        o60Var.V = null;
                        o60Var.f27870j0 = true;
                        c11 c11Var = o60Var.T;
                        if (c11Var == null) {
                            b11Var2 = null;
                        } else {
                            synchronized (c11Var) {
                                a11 a11Var = (a11) c11Var.f23913c.get(Long.valueOf(j11));
                                if (a11Var != null && !a11Var.e) {
                                    b11Var = new b11(Math.max(a11Var.f23411c, file.length()), a11Var.f23412f, a11Var.f23413g, a11Var.h, a11Var.f23414i);
                                }
                                b11Var = new b11(file.length(), null, null, null, null);
                            }
                            b11Var2 = b11Var;
                        }
                        VideoEditedInfo r10 = o60Var.r(file, j10, b11Var2);
                        r10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = n60Var.f27594c;
                        photoEntry.effectId = n60Var.d;
                        o60Var.f27865f.s(photoEntry, r10, n60Var.f27592a, n60Var.f27593b, 0, false, n60Var.e);
                        c11 c11Var2 = o60Var.T;
                        if (c11Var2 != null) {
                            c11Var2.d(false);
                        }
                        o60Var.T = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public j0(u0 u0Var, q0 q0Var, File file, long j10, boolean z10) {
        this.f14816b = u0Var;
        this.f14817c = q0Var;
        this.e = file;
        this.d = j10;
        this.f14818f = z10;
    }
}
