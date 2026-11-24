package defpackage;
public final class k40 implements Runnable {
    public final byte a;
    public final lx6 b;
    public final ia3 c;

    public k40(lx6 lx6Var, ia3 ia3Var, byte b) {
        this.a = b;
        this.b = lx6Var;
        this.c = ia3Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                lx6 lx6Var = this.b;
                ia3 ia3Var = this.c;
                synchronized (ia3Var) {
                }
                String str = hac.a;
                xa3 xa3Var = ((c74) ((o40) lx6Var.c)).a.s;
                tk R = xa3Var.R((rz6) xa3Var.d.e);
                xa3Var.V(R, 1013, new ua3(R, ia3Var, (byte) 8));
                return;
            default:
                lx6 lx6Var2 = this.b;
                ia3 ia3Var2 = this.c;
                String str2 = hac.a;
                xa3 xa3Var2 = ((c74) ((o40) lx6Var2.c)).a.s;
                tk U = xa3Var2.U();
                xa3Var2.V(U, 1007, new ua3(U, ia3Var2, (byte) 3));
                return;
        }
    }
}
