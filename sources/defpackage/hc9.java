package defpackage;
public final class hc9 implements Runnable {
    public final byte a;
    public final mc9 b;

    public hc9(mc9 mc9Var, byte b) {
        this.a = b;
        this.b = mc9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mc9 mc9Var = this.b;
        switch (b) {
            case 0:
                mf9 mf9Var = mc9Var.L2;
                if (mf9Var != null && mc9Var.f2 != null) {
                    mc9Var.M2 = true;
                    mf9Var.b().a.m(false);
                    try {
                        mc9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((wd9) mc9Var.f2).a(mc9Var, mc9Var.L2, true);
                    return;
                }
                return;
            case 1:
                mc9Var.K();
                return;
            default:
                mc9Var.P();
                return;
        }
    }
}
