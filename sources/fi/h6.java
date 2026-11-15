package fi;

import org.telegram.messenger.ns;
public final class h6 implements Runnable {
    public final int f11776a;
    public final k6 f11777b;

    public h6(k6 k6Var, int i7) {
        this.f11776a = i7;
        this.f11777b = k6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11776a;
        k6 k6Var = this.f11777b;
        switch (i7) {
            case 0:
                ns.f(k6Var.f11940c).k(326, k6Var);
                return;
            case 1:
                k6Var.f11956u = false;
                k6Var.f11957w = true;
                ns.f(k6Var.f11940c).k(326, k6Var, Boolean.FALSE);
                return;
            case 2:
                k6Var.f11960z = false;
                return;
            default:
                k6Var.f11946k.clear();
                k6Var.d(true);
                return;
        }
    }
}
