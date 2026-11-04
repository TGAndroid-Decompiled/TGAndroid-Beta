package ei;

import b8.nf;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.NativeInstance;
public final class a1 implements Runnable {
    public final int f10075a;
    public final g1 f10076b;

    public a1(g1 g1Var, int i3) {
        this.f10075a = i3;
        this.f10076b = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f10075a) {
            case 0:
                this.f10076b.p();
                return;
            case 1:
                this.f10076b.q();
                return;
            case 2:
                this.f10076b.t(true);
                return;
            case 3:
                g1 g1Var = this.f10076b;
                hs.f(g1Var.f10299e).k(176, Long.valueOf(g1Var.f10304w.f27011id));
                g1Var.u(true);
                return;
            case 4:
                this.f10076b.w();
                return;
            case 5:
                this.f10076b.t(true);
                return;
            case 6:
                g1 g1Var2 = this.f10076b;
                if (g1Var2.F != null) {
                    org.telegram.messenger.p5 p5Var = Utilities.f21387e;
                    NativeInstance nativeInstance = g1Var2.F;
                    Objects.requireNonNull(nativeInstance);
                    p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                    g1Var2.N.clear();
                    g1Var2.F = null;
                }
                g1Var2.k();
                return;
            case 7:
                this.f10076b.t(true);
                return;
            case 8:
                this.f10076b.t(true);
                return;
            case 9:
                g1 g1Var3 = this.f10076b;
                if (g1Var3.F != null) {
                    org.telegram.messenger.p5 p5Var2 = Utilities.f21387e;
                    NativeInstance nativeInstance2 = g1Var3.F;
                    Objects.requireNonNull(nativeInstance2);
                    p5Var2.c(new org.telegram.messenger.voip.p0(nativeInstance2, 3));
                    g1Var3.N.clear();
                    g1Var3.F = null;
                }
                g1Var3.k();
                return;
            case 10:
                this.f10076b.p();
                return;
            case 11:
                this.f10076b.q();
                return;
            default:
                g1 g1Var4 = this.f10076b;
                if (!g1Var4.f10301n) {
                    nf.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.v2(g1Var4, 14));
                    return;
                }
                return;
        }
    }
}
