package defpackage;
public final class l30 implements Runnable {
    public final byte a;
    public final lh2 b;
    public final p93 c;

    public l30(lh2 lh2Var, p93 p93Var, byte b) {
        this.a = b;
        this.b = lh2Var;
        this.c = p93Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                lh2 lh2Var = this.b;
                p93 p93Var = this.c;
                synchronized (p93Var) {
                }
                String str = gcc.a;
                ea3 ea3Var = ((n64) ((p30) lh2Var.c)).a.s;
                uj R = ea3Var.R((vz6) ea3Var.d.e);
                ea3Var.V(R, 1013, new aa3(R, p93Var, (byte) 13));
                return;
            default:
                lh2 lh2Var2 = this.b;
                p93 p93Var2 = this.c;
                String str2 = gcc.a;
                ea3 ea3Var2 = ((n64) ((p30) lh2Var2.c)).a.s;
                uj U = ea3Var2.U();
                ea3Var2.V(U, 1007, new aa3(U, p93Var2, (byte) 8));
                return;
        }
    }
}
