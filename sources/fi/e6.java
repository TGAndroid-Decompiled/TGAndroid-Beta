package fi;

import org.telegram.messenger.ls;
public final class e6 implements Runnable {
    public final int f11932a;
    public final h6 f11933b;

    public e6(h6 h6Var, int i7) {
        this.f11932a = i7;
        this.f11933b = h6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11932a;
        h6 h6Var = this.f11933b;
        switch (i7) {
            case 0:
                ls.f(h6Var.f12085c).k(329, h6Var);
                return;
            case 1:
                h6Var.f12101u = false;
                h6Var.f12102w = true;
                ls.f(h6Var.f12085c).k(329, h6Var, Boolean.FALSE);
                return;
            case 2:
                h6Var.f12105z = false;
                return;
            default:
                h6Var.f12091k.clear();
                h6Var.d(true);
                return;
        }
    }
}
