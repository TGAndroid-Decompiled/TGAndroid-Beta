package fi;

import org.telegram.messenger.ks;
public final class e6 implements Runnable {
    public final int f11890a;
    public final h6 f11891b;

    public e6(h6 h6Var, int i7) {
        this.f11890a = i7;
        this.f11891b = h6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11890a;
        h6 h6Var = this.f11891b;
        switch (i7) {
            case 0:
                ks.f(h6Var.f12044c).k(328, h6Var);
                return;
            case 1:
                h6Var.f12060u = false;
                h6Var.f12061w = true;
                ks.f(h6Var.f12044c).k(328, h6Var, Boolean.FALSE);
                return;
            case 2:
                h6Var.f12064z = false;
                return;
            default:
                h6Var.f12050k.clear();
                h6Var.d(true);
                return;
        }
    }
}
