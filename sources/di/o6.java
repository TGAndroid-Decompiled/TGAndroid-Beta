package di;

import org.telegram.messenger.qs;
public final class o6 implements Runnable {
    public final int f9439a;
    public final r6 f9440b;

    public o6(r6 r6Var, int i7) {
        this.f9439a = i7;
        this.f9440b = r6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9439a;
        r6 r6Var = this.f9440b;
        switch (i7) {
            case 0:
                qs.f(r6Var.f9690c).k(326, r6Var);
                return;
            case 1:
                r6Var.f9706u = false;
                r6Var.f9707w = true;
                qs.f(r6Var.f9690c).k(326, r6Var, Boolean.FALSE);
                return;
            case 2:
                r6Var.f9710z = false;
                return;
            default:
                r6Var.f9696k.clear();
                r6Var.d(true);
                return;
        }
    }
}
