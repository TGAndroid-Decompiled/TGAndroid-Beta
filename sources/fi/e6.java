package fi;

import org.telegram.messenger.ks;
public final class e6 implements Runnable {
    public final int f11887a;
    public final h6 f11888b;

    public e6(h6 h6Var, int i7) {
        this.f11887a = i7;
        this.f11888b = h6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11887a;
        h6 h6Var = this.f11888b;
        switch (i7) {
            case 0:
                ks.f(h6Var.f12041c).k(329, h6Var);
                return;
            case 1:
                h6Var.f12057u = false;
                h6Var.f12058w = true;
                ks.f(h6Var.f12041c).k(329, h6Var, Boolean.FALSE);
                return;
            case 2:
                h6Var.f12061z = false;
                return;
            default:
                h6Var.f12047k.clear();
                h6Var.d(true);
                return;
        }
    }
}
