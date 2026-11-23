package hi;

import org.telegram.messenger.hd;
public final class p0 implements Runnable {
    public final int f15245a;
    public final v0 f15246b;

    public p0(v0 v0Var, int i7) {
        this.f15245a = i7;
        this.f15246b = v0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f15245a;
        v0 v0Var = this.f15246b;
        switch (i7) {
            case 0:
                v0Var.b();
                return;
            case 1:
                v0Var.f15595e = false;
                s0 s0Var = v0Var.f15599s;
                if (s0Var != null) {
                    s0Var.a(true);
                    v0Var.f15599s = null;
                }
                u0 u0Var = v0Var.f15597n;
                if (u0Var != null) {
                    u0Var.a();
                }
                v0Var.f15594c = false;
                v0Var.d();
                return;
            default:
                if (v0Var.f15594c && v0Var.f15598r != null) {
                    v0Var.f15597n.b(2131624012, 3500, hd.O0("VideoConvertFail"));
                    v0Var.f15594c = false;
                    v0Var.d();
                    return;
                }
                return;
        }
    }
}
