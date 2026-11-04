package gi;

import org.telegram.messenger.bd;
public final class n0 implements Runnable {
    public final int f13275a;
    public final t0 f13276b;

    public n0(t0 t0Var, int i3) {
        this.f13275a = i3;
        this.f13276b = t0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f13275a;
        t0 t0Var = this.f13276b;
        switch (i3) {
            case 0:
                t0Var.b();
                return;
            case 1:
                t0Var.f13593e = false;
                q0 q0Var = t0Var.f13597s;
                if (q0Var != null) {
                    q0Var.a(true);
                    t0Var.f13597s = null;
                }
                s0 s0Var = t0Var.f13595n;
                if (s0Var != null) {
                    s0Var.a();
                }
                t0Var.f13592c = false;
                t0Var.d();
                return;
            default:
                if (t0Var.f13592c && t0Var.f13596r != null) {
                    t0Var.f13595n.b(2131624011, 3500, bd.N0("VideoConvertFail"));
                    t0Var.f13592c = false;
                    t0Var.d();
                    return;
                }
                return;
        }
    }
}
