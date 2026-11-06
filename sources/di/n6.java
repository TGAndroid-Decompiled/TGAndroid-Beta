package di;

import org.telegram.messenger.qs;
public final class n6 implements Runnable {
    public final int f9406a;
    public final q6 f9407b;

    public n6(q6 q6Var, int i7) {
        this.f9406a = i7;
        this.f9407b = q6Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9406a;
        q6 q6Var = this.f9407b;
        switch (i7) {
            case 0:
                qs.f(q6Var.f9639c).k(326, q6Var);
                return;
            case 1:
                q6Var.f9655u = false;
                q6Var.f9656w = true;
                qs.f(q6Var.f9639c).k(326, q6Var, Boolean.FALSE);
                return;
            case 2:
                q6Var.f9659z = false;
                return;
            default:
                q6Var.f9645k.clear();
                q6Var.d(true);
                return;
        }
    }
}
