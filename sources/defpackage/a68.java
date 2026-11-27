package defpackage;
public final class a68 implements Runnable {
    public final byte a;
    public final j68 b;

    public a68(j68 j68Var, byte b) {
        this.a = b;
        this.b = j68Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        j68 j68Var = this.b;
        switch (b) {
            case 0:
                o68 o68Var = j68Var.x;
                k68 k68Var = o68Var.A1;
                if (k68Var != null) {
                    lcb lcbVar = ((ccb) k68Var).d;
                    lcbVar.Z0 = false;
                    lcbVar.U();
                }
                o68Var.c1(false);
                o68Var.R2 = true;
                o68Var.u0.E(true);
                return;
            case 1:
                o68 o68Var2 = j68Var.x;
                o68Var2.D3 = true;
                o68Var2.setActive(false);
                return;
            case 2:
                o68 o68Var3 = j68Var.x;
                o68Var3.D3 = true;
                o68Var3.setActive(false);
                return;
            default:
                ((ccb) j68Var.x.A1).g(false);
                return;
        }
    }
}
