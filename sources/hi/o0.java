package hi;

import org.telegram.messenger.hd;
public final class o0 implements Runnable {
    public final int f15098a;
    public final u0 f15099b;

    public o0(u0 u0Var, int i7) {
        this.f15098a = i7;
        this.f15099b = u0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f15098a;
        u0 u0Var = this.f15099b;
        switch (i7) {
            case 0:
                u0Var.b();
                return;
            case 1:
                u0Var.f15481e = false;
                r0 r0Var = u0Var.f15485s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f15485s = null;
                }
                t0 t0Var = u0Var.f15483n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f15480c = false;
                u0Var.d();
                return;
            default:
                if (u0Var.f15480c && u0Var.f15484r != null) {
                    u0Var.f15483n.b(2131624012, 3500, hd.O0("VideoConvertFail"));
                    u0Var.f15480c = false;
                    u0Var.d();
                    return;
                }
                return;
        }
    }
}
