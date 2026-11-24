package defpackage;
public final class m40 implements Runnable {
    public final byte a;
    public final lx6 b;
    public final nf5 c;

    public m40(lx6 lx6Var, nf5 nf5Var, byte b) {
        this.a = b;
        this.b = lx6Var;
        this.c = nf5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nf5 nf5Var = this.c;
        lx6 lx6Var = this.b;
        switch (b) {
            case 0:
                String str = hac.a;
                xa3 xa3Var = ((c74) ((o40) lx6Var.c)).a.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1032, new wa3(U, nf5Var, (byte) 0));
                return;
            default:
                String str2 = hac.a;
                xa3 xa3Var2 = ((c74) ((o40) lx6Var.c)).a.s;
                tk U2 = xa3Var2.U();
                xa3Var2.V(U2, 1031, new ua3(U2, nf5Var, (byte) 13));
                return;
        }
    }
}
