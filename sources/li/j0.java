package li;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ff;
import org.telegram.messenger.y20;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.mz0;
public final class j0 implements Runnable {
    public final int f12096a = 1;
    public final x0 f12097b;
    public final t0 f12098c;
    public final long d;
    public final File e;
    public final boolean f12099f;

    public j0(x0 x0Var, t0 t0Var, long j10, File file, boolean z10) {
        this.f12097b = x0Var;
        this.f12098c = t0Var;
        this.d = j10;
        this.e = file;
        this.f12099f = z10;
    }

    private final void a() {
        x0 x0Var = this.f12097b;
        t0 t0Var = this.f12098c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f12099f;
        synchronized (x0Var.f12312g) {
            if (!x0Var.G && !t0Var.d && !t0Var.e) {
                t0Var.e = true;
                ((mz0) x0Var.e).b(t0Var.f12248a, file.length(), file);
                x0Var.f12313i.post(new j0(x0Var, t0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        lz0 lz0Var;
        lz0 lz0Var2;
        switch (this.f12096a) {
            case 0:
                a();
                return;
            default:
                x0 x0Var = this.f12097b;
                t0 t0Var = this.f12098c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f12099f;
                int i10 = x0Var.Z;
                if (i10 != 10 && i10 != 9) {
                    x0Var.w(8);
                    x0Var.f12317m.b("output completed: generation=" + t0Var.f12248a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    x0Var.m("completed");
                    k2.m0 m0Var = x0Var.d;
                    long j11 = t0Var.f12248a;
                    d50 d50Var = (d50) m0Var.f10701a;
                    c50 c50Var = d50Var.U;
                    if (c50Var != null) {
                        d50Var.U = null;
                        d50Var.f25389j0 = true;
                        mz0 mz0Var = d50Var.S;
                        if (mz0Var == null) {
                            lz0Var2 = null;
                        } else {
                            synchronized (mz0Var) {
                                kz0 kz0Var = (kz0) mz0Var.f28617c.get(Long.valueOf(j11));
                                if (kz0Var != null && !kz0Var.e) {
                                    lz0Var = new lz0(Math.max(kz0Var.f27992c, file.length()), kz0Var.f27993f, kz0Var.f27994g, kz0Var.h, kz0Var.f27995i);
                                }
                                lz0Var = new lz0(file.length(), null, null, null, null);
                            }
                            lz0Var2 = lz0Var;
                        }
                        y20 s10 = d50Var.s(file, j10, lz0Var2);
                        s10.f19544t = !z10;
                        ff ffVar = new ff(0, file.getAbsolutePath(), 0, true, 0, 0);
                        ffVar.f14621x = c50Var.f25012c;
                        ffVar.f14622y = c50Var.d;
                        d50Var.e.u(ffVar, s10, c50Var.f25010a, c50Var.f25011b, 0, false, c50Var.e);
                        mz0 mz0Var2 = d50Var.S;
                        if (mz0Var2 != null) {
                            mz0Var2.d(false);
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
        this.f12097b = x0Var;
        this.f12098c = t0Var;
        this.e = file;
        this.d = j10;
        this.f12099f = z10;
    }
}
