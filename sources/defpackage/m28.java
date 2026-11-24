package defpackage;
public final class m28 implements Runnable {
    public final byte a;
    public final s28 b;

    public m28(s28 s28Var, byte b) {
        this.a = b;
        this.b = s28Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        s28 s28Var = this.b;
        switch (b) {
            case 0:
                ((d8b) s28Var.x.G1).g(false);
                return;
            case 1:
                y28 y28Var = s28Var.x;
                t28 t28Var = y28Var.G1;
                if (t28Var != null) {
                    m8b m8bVar = ((d8b) t28Var).d;
                    m8bVar.Z0 = false;
                    m8bVar.U();
                }
                y28Var.c1(false);
                y28Var.X2 = true;
                y28Var.A0.E(true);
                return;
            case 2:
                y28 y28Var2 = s28Var.x;
                y28Var2.J3 = true;
                y28Var2.setActive(false);
                return;
            default:
                y28 y28Var3 = s28Var.x;
                y28Var3.J3 = true;
                y28Var3.setActive(false);
                return;
        }
    }
}
