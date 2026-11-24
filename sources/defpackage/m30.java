package defpackage;
public final class m30 implements Runnable {
    public final byte a;
    public final tg2 b;
    public final pd5 c;

    public m30(tg2 tg2Var, pd5 pd5Var, byte b) {
        this.a = b;
        this.b = tg2Var;
        this.c = pd5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pd5 pd5Var = this.c;
        tg2 tg2Var = this.b;
        switch (b) {
            case 0:
                String str = g8c.a;
                l93 l93Var = ((t54) ((o30) tg2Var.c)).a.s;
                tj U = l93Var.U();
                l93Var.V(U, 1032, new i93(U, pd5Var, (byte) 29));
                return;
            default:
                String str2 = g8c.a;
                l93 l93Var2 = ((t54) ((o30) tg2Var.c)).a.s;
                tj U2 = l93Var2.U();
                l93Var2.V(U2, 1031, new i93(U2, pd5Var, (byte) 12));
                return;
        }
    }
}
