package li;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ef;
import org.telegram.messenger.x20;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.lz0;
public final class j0 implements Runnable {
    public final int f12095a = 1;
    public final x0 f12096b;
    public final t0 f12097c;
    public final long d;
    public final File e;
    public final boolean f12098f;

    public j0(x0 x0Var, t0 t0Var, long j10, File file, boolean z10) {
        this.f12096b = x0Var;
        this.f12097c = t0Var;
        this.d = j10;
        this.e = file;
        this.f12098f = z10;
    }

    private final void a() {
        x0 x0Var = this.f12096b;
        t0 t0Var = this.f12097c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f12098f;
        synchronized (x0Var.f12311g) {
            if (!x0Var.G && !t0Var.d && !t0Var.e) {
                t0Var.e = true;
                ((lz0) x0Var.e).b(t0Var.f12247a, file.length(), file);
                x0Var.f12312i.post(new j0(x0Var, t0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        kz0 kz0Var;
        kz0 kz0Var2;
        switch (this.f12095a) {
            case 0:
                a();
                return;
            default:
                x0 x0Var = this.f12096b;
                t0 t0Var = this.f12097c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f12098f;
                int i10 = x0Var.Z;
                if (i10 != 10 && i10 != 9) {
                    x0Var.w(8);
                    x0Var.f12316m.b("output completed: generation=" + t0Var.f12247a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    x0Var.m("completed");
                    k2.m0 m0Var = x0Var.d;
                    long j11 = t0Var.f12247a;
                    d50 d50Var = (d50) m0Var.f10700a;
                    c50 c50Var = d50Var.U;
                    if (c50Var != null) {
                        d50Var.U = null;
                        d50Var.f25318j0 = true;
                        lz0 lz0Var = d50Var.S;
                        if (lz0Var == null) {
                            kz0Var2 = null;
                        } else {
                            synchronized (lz0Var) {
                                jz0 jz0Var = (jz0) lz0Var.f28230c.get(Long.valueOf(j11));
                                if (jz0Var != null && !jz0Var.e) {
                                    kz0Var = new kz0(Math.max(jz0Var.f27580c, file.length()), jz0Var.f27581f, jz0Var.f27582g, jz0Var.h, jz0Var.f27583i);
                                }
                                kz0Var = new kz0(file.length(), null, null, null, null);
                            }
                            kz0Var2 = kz0Var;
                        }
                        x20 s10 = d50Var.s(file, j10, kz0Var2);
                        s10.f19201t = !z10;
                        ef efVar = new ef(0, file.getAbsolutePath(), 0, true, 0, 0);
                        efVar.f19525x = c50Var.f24987c;
                        efVar.f19526y = c50Var.d;
                        d50Var.e.t(efVar, s10, c50Var.f24985a, c50Var.f24986b, 0, false, c50Var.e);
                        lz0 lz0Var2 = d50Var.S;
                        if (lz0Var2 != null) {
                            lz0Var2.d(false);
                        }
                        d50Var.S = null;
                        MediaController.B().Y(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public j0(x0 x0Var, t0 t0Var, File file, long j10, boolean z10) {
        this.f12096b = x0Var;
        this.f12097c = t0Var;
        this.e = file;
        this.d = j10;
        this.f12098f = z10;
    }
}
