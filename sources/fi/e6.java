package fi;

import org.telegram.messenger.ls;
public final class e6 implements Runnable {
    public final int f11882a;
    public final h6 f11883b;

    public e6(h6 h6Var, int i7) {
        this.f11882a = i7;
        this.f11883b = h6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11882a;
        h6 h6Var = this.f11883b;
        switch (i7) {
            case 0:
                ls.f(h6Var.f12036c).k(329, h6Var);
                return;
            case 1:
                h6Var.f12052u = false;
                h6Var.f12053w = true;
                ls.f(h6Var.f12036c).k(329, h6Var, Boolean.FALSE);
                return;
            case 2:
                h6Var.f12056z = false;
                return;
            default:
                h6Var.f12042k.clear();
                h6Var.d(true);
                return;
        }
    }
}
