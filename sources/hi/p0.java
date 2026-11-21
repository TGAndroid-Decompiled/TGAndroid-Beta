package hi;

import org.telegram.messenger.gd;
public final class p0 implements Runnable {
    public final int f15242a;
    public final v0 f15243b;

    public p0(v0 v0Var, int i7) {
        this.f15242a = i7;
        this.f15243b = v0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f15242a;
        v0 v0Var = this.f15243b;
        switch (i7) {
            case 0:
                v0Var.b();
                return;
            case 1:
                v0Var.f15592e = false;
                s0 s0Var = v0Var.f15596s;
                if (s0Var != null) {
                    s0Var.a(true);
                    v0Var.f15596s = null;
                }
                u0 u0Var = v0Var.f15594n;
                if (u0Var != null) {
                    u0Var.a();
                }
                v0Var.f15591c = false;
                v0Var.d();
                return;
            default:
                if (v0Var.f15591c && v0Var.f15595r != null) {
                    v0Var.f15594n.b(2131624012, 3500, gd.O0("VideoConvertFail"));
                    v0Var.f15591c = false;
                    v0Var.d();
                    return;
                }
                return;
        }
    }
}
