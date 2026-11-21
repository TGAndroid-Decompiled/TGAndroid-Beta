package fi;

import org.telegram.messenger.ks;
public final class e6 implements Runnable {
    public final int f11929a;
    public final h6 f11930b;

    public e6(h6 h6Var, int i7) {
        this.f11929a = i7;
        this.f11930b = h6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11929a;
        h6 h6Var = this.f11930b;
        switch (i7) {
            case 0:
                ks.f(h6Var.f12082c).k(329, h6Var);
                return;
            case 1:
                h6Var.f12098u = false;
                h6Var.f12099w = true;
                ks.f(h6Var.f12082c).k(329, h6Var, Boolean.FALSE);
                return;
            case 2:
                h6Var.f12102z = false;
                return;
            default:
                h6Var.f12088k.clear();
                h6Var.d(true);
                return;
        }
    }
}
