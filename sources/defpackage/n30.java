package defpackage;
public final class n30 implements Runnable {
    public final byte a;
    public final lh2 b;
    public final qf5 c;

    public n30(lh2 lh2Var, qf5 qf5Var, byte b) {
        this.a = b;
        this.b = lh2Var;
        this.c = qf5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qf5 qf5Var = this.c;
        lh2 lh2Var = this.b;
        switch (b) {
            case 0:
                String str = gcc.a;
                ea3 ea3Var = ((n64) ((p30) lh2Var.c)).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1032, new da3(U, qf5Var, (byte) 5));
                return;
            default:
                String str2 = gcc.a;
                ea3 ea3Var2 = ((n64) ((p30) lh2Var.c)).a.s;
                uj U2 = ea3Var2.U();
                ea3Var2.V(U2, 1031, new aa3(U2, qf5Var, (byte) 18));
                return;
        }
    }
}
