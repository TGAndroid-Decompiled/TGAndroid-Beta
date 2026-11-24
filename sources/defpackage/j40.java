package defpackage;
public final class j40 implements Runnable {
    public final byte a;
    public final lx6 b;
    public final Exception c;

    public j40(lx6 lx6Var, Exception exc, byte b) {
        this.a = b;
        this.b = lx6Var;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        lx6 lx6Var = this.b;
        switch (b) {
            case 0:
                String str = hac.a;
                xa3 xa3Var = ((c74) ((o40) lx6Var.c)).a.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1029, new u03(U, exc, (byte) 28));
                return;
            default:
                String str2 = hac.a;
                xa3 xa3Var2 = ((c74) ((o40) lx6Var.c)).a.s;
                tk U2 = xa3Var2.U();
                xa3Var2.V(U2, 1014, new ua3(U2, exc, (byte) 20));
                return;
        }
    }
}
