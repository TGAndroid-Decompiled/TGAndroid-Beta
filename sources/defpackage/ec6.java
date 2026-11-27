package defpackage;

import org.telegram.messenger.a;
public final class ec6 implements Runnable {
    public final byte a;
    public final uc6 b;
    public final xj5 c;

    public ec6(uc6 uc6Var, xj5 xj5Var, byte b) {
        this.a = b;
        this.b = uc6Var;
        this.c = xj5Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                uc6 uc6Var = this.b;
                xj5 xj5Var = this.c;
                if (uc6Var.H != null && uc6Var.getParentActivity() != null) {
                    try {
                        ((am2) xj5Var).F();
                        ((z3f) a.j()).initializeMaps(a.b);
                        ((am2) uc6Var.H).y(new hw(uc6Var, (byte) 9));
                        uc6Var.x0 = true;
                        if (uc6Var.y0) {
                            ((am2) uc6Var.H).I();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                uc6 uc6Var2 = this.b;
                xj5 xj5Var2 = this.c;
                try {
                    ((am2) xj5Var2).F();
                } catch (Exception unused) {
                }
                hl.c3(new ec6(uc6Var2, xj5Var2, (byte) 0));
                return;
        }
    }
}
