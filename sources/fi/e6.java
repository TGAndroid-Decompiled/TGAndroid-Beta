package fi;

import org.telegram.messenger.ks;
public final class e6 implements Runnable {
    public final int f11894a;
    public final h6 f11895b;

    public e6(h6 h6Var, int i7) {
        this.f11894a = i7;
        this.f11895b = h6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11894a;
        h6 h6Var = this.f11895b;
        switch (i7) {
            case 0:
                ks.f(h6Var.f12047c).k(329, h6Var);
                return;
            case 1:
                h6Var.f12063u = false;
                h6Var.f12064w = true;
                ks.f(h6Var.f12047c).k(329, h6Var, Boolean.FALSE);
                return;
            case 2:
                h6Var.f12067z = false;
                return;
            default:
                h6Var.f12053k.clear();
                h6Var.d(true);
                return;
        }
    }
}
