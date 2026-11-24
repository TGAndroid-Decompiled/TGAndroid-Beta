package defpackage;

import org.telegram.messenger.a;
public final class zb6 implements Runnable {
    public final byte a;
    public final pc6 b;
    public final uj5 c;

    public zb6(pc6 pc6Var, uj5 uj5Var, byte b) {
        this.a = b;
        this.b = pc6Var;
        this.c = uj5Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                pc6 pc6Var = this.b;
                uj5 uj5Var = this.c;
                if (pc6Var.H != null && pc6Var.getParentActivity() != null) {
                    try {
                        ((sm2) uj5Var).F();
                        ((k1f) a.j()).initializeMaps(a.b);
                        ((sm2) pc6Var.H).w(new gx(pc6Var, (byte) 9));
                        pc6Var.x0 = true;
                        if (pc6Var.y0) {
                            ((sm2) pc6Var.H).I();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                pc6 pc6Var2 = this.b;
                uj5 uj5Var2 = this.c;
                try {
                    ((sm2) uj5Var2).F();
                } catch (Exception unused) {
                }
                gm.c3(new zb6(pc6Var2, uj5Var2, (byte) 0));
                return;
        }
    }
}
