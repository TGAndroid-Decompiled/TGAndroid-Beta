package ei;

import org.telegram.messenger.hs;
public final class o6 implements Runnable {
    public final int f10694a;
    public final r6 f10695b;

    public o6(r6 r6Var, int i3) {
        this.f10694a = i3;
        this.f10695b = r6Var;
    }

    @Override
    public final void run() {
        int i3 = this.f10694a;
        r6 r6Var = this.f10695b;
        switch (i3) {
            case 0:
                hs.f(r6Var.f10872c).k(326, r6Var);
                return;
            case 1:
                r6Var.f10888u = false;
                r6Var.f10889w = true;
                hs.f(r6Var.f10872c).k(326, r6Var, Boolean.FALSE);
                return;
            case 2:
                r6Var.f10892z = false;
                return;
            default:
                r6Var.f10878k.clear();
                r6Var.d(true);
                return;
        }
    }
}
