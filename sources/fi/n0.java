package fi;

import org.telegram.messenger.id;
public final class n0 implements Runnable {
    public final int f12470a;
    public final t0 f12471b;

    public n0(t0 t0Var, int i7) {
        this.f12470a = i7;
        this.f12471b = t0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f12470a;
        t0 t0Var = this.f12471b;
        switch (i7) {
            case 0:
                t0Var.b();
                return;
            case 1:
                t0Var.f12832e = false;
                q0 q0Var = t0Var.f12836s;
                if (q0Var != null) {
                    q0Var.a(true);
                    t0Var.f12836s = null;
                }
                s0 s0Var = t0Var.f12834n;
                if (s0Var != null) {
                    s0Var.a();
                }
                t0Var.f12831c = false;
                t0Var.d();
                return;
            default:
                if (t0Var.f12831c && t0Var.f12835r != null) {
                    t0Var.f12834n.b(2131624011, 3500, id.N0("VideoConvertFail"));
                    t0Var.f12831c = false;
                    t0Var.d();
                    return;
                }
                return;
        }
    }
}
