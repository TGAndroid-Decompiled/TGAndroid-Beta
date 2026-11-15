package hi;

import org.telegram.messenger.hd;
public final class o0 implements Runnable {
    public final int f14790a;
    public final u0 f14791b;

    public o0(u0 u0Var, int i7) {
        this.f14790a = i7;
        this.f14791b = u0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f14790a;
        u0 u0Var = this.f14791b;
        switch (i7) {
            case 0:
                u0Var.b();
                return;
            case 1:
                u0Var.f15171e = false;
                r0 r0Var = u0Var.f15175s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f15175s = null;
                }
                t0 t0Var = u0Var.f15173n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f15170c = false;
                u0Var.d();
                return;
            default:
                if (u0Var.f15170c && u0Var.f15174r != null) {
                    u0Var.f15173n.b(2131624012, 3500, hd.N0("VideoConvertFail"));
                    u0Var.f15170c = false;
                    u0Var.d();
                    return;
                }
                return;
        }
    }
}
