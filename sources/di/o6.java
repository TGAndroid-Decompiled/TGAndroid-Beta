package di;

import org.telegram.messenger.qs;
public final class o6 implements Runnable {
    public final int f9444a;
    public final r6 f9445b;

    public o6(r6 r6Var, int i7) {
        this.f9444a = i7;
        this.f9445b = r6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9444a;
        r6 r6Var = this.f9445b;
        switch (i7) {
            case 0:
                qs.f(r6Var.f9695c).k(326, r6Var);
                return;
            case 1:
                r6Var.f9711u = false;
                r6Var.f9712w = true;
                qs.f(r6Var.f9695c).k(326, r6Var, Boolean.FALSE);
                return;
            case 2:
                r6Var.f9715z = false;
                return;
            default:
                r6Var.f9701k.clear();
                r6Var.d(true);
                return;
        }
    }
}
