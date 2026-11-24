package defpackage;
public final class ri0 implements Runnable {
    public final byte a;
    public final aj0 b;

    public ri0(aj0 aj0Var, byte b) {
        this.a = b;
        this.b = aj0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        aj0 aj0Var = this.b;
        switch (b) {
            case 0:
                lj0 lj0Var = aj0Var.m0;
                aod aodVar = lj0Var.c;
                aod aodVar2 = aodVar;
                if (aodVar == null) {
                    ?? obj = new Object();
                    lj0Var.c = obj;
                    aodVar2 = obj;
                }
                aodVar2.b();
                return;
            default:
                aj0Var.m0.u = false;
                return;
        }
    }
}
