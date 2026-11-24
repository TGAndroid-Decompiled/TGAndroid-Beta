package defpackage;
public final class j30 implements Runnable {
    public final byte a;
    public final tg2 b;
    public final Exception c;

    public j30(tg2 tg2Var, Exception exc, byte b) {
        this.a = b;
        this.b = tg2Var;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        tg2 tg2Var = this.b;
        switch (b) {
            case 0:
                String str = g8c.a;
                l93 l93Var = ((t54) ((o30) tg2Var.c)).a.s;
                tj U = l93Var.U();
                l93Var.V(U, 1029, new jz2(U, exc, (byte) 27));
                return;
            default:
                String str2 = g8c.a;
                l93 l93Var2 = ((t54) ((o30) tg2Var.c)).a.s;
                tj U2 = l93Var2.U();
                l93Var2.V(U2, 1014, new i93(U2, exc, (byte) 19));
                return;
        }
    }
}
