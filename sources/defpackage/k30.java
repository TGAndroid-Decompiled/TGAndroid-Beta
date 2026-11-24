package defpackage;
public final class k30 implements Runnable {
    public final byte a;
    public final tg2 b;
    public final w83 c;

    public k30(tg2 tg2Var, w83 w83Var, byte b) {
        this.a = b;
        this.b = tg2Var;
        this.c = w83Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                tg2 tg2Var = this.b;
                w83 w83Var = this.c;
                synchronized (w83Var) {
                }
                String str = g8c.a;
                l93 l93Var = ((t54) ((o30) tg2Var.c)).a.s;
                tj R = l93Var.R((rx6) l93Var.d.e);
                l93Var.V(R, 1013, new i93(R, w83Var, (byte) 7));
                return;
            default:
                tg2 tg2Var2 = this.b;
                w83 w83Var2 = this.c;
                String str2 = g8c.a;
                l93 l93Var2 = ((t54) ((o30) tg2Var2.c)).a.s;
                tj U = l93Var2.U();
                l93Var2.V(U, 1007, new i93(U, w83Var2, (byte) 2));
                return;
        }
    }
}
