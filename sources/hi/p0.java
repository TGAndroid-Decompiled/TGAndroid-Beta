package hi;

import org.telegram.messenger.gd;
public final class p0 implements Runnable {
    public final int f15208a;
    public final v0 f15209b;

    public p0(v0 v0Var, int i7) {
        this.f15208a = i7;
        this.f15209b = v0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f15208a;
        v0 v0Var = this.f15209b;
        switch (i7) {
            case 0:
                v0Var.b();
                return;
            case 1:
                v0Var.f15559e = false;
                s0 s0Var = v0Var.f15563s;
                if (s0Var != null) {
                    s0Var.a(true);
                    v0Var.f15563s = null;
                }
                u0 u0Var = v0Var.f15561n;
                if (u0Var != null) {
                    u0Var.a();
                }
                v0Var.f15558c = false;
                v0Var.d();
                return;
            default:
                if (v0Var.f15558c && v0Var.f15562r != null) {
                    v0Var.f15561n.b(2131624012, 3500, gd.N0("VideoConvertFail"));
                    v0Var.f15558c = false;
                    v0Var.d();
                    return;
                }
                return;
        }
    }
}
