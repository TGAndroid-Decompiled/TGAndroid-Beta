package hi;

import org.telegram.messenger.gd;
public final class p0 implements Runnable {
    public final int f15211a;
    public final v0 f15212b;

    public p0(v0 v0Var, int i7) {
        this.f15211a = i7;
        this.f15212b = v0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f15211a;
        v0 v0Var = this.f15212b;
        switch (i7) {
            case 0:
                v0Var.b();
                return;
            case 1:
                v0Var.f15562e = false;
                s0 s0Var = v0Var.f15566s;
                if (s0Var != null) {
                    s0Var.a(true);
                    v0Var.f15566s = null;
                }
                u0 u0Var = v0Var.f15564n;
                if (u0Var != null) {
                    u0Var.a();
                }
                v0Var.f15561c = false;
                v0Var.d();
                return;
            default:
                if (v0Var.f15561c && v0Var.f15565r != null) {
                    v0Var.f15564n.b(2131624012, 3500, gd.N0("VideoConvertFail"));
                    v0Var.f15561c = false;
                    v0Var.d();
                    return;
                }
                return;
        }
    }
}
