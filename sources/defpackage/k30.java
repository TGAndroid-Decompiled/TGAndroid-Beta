package defpackage;
public final class k30 implements Runnable {
    public final byte a;
    public final lh2 b;
    public final Exception c;

    public k30(lh2 lh2Var, Exception exc, byte b) {
        this.a = b;
        this.b = lh2Var;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        lh2 lh2Var = this.b;
        switch (b) {
            case 0:
                String str = gcc.a;
                ea3 ea3Var = ((n64) ((p30) lh2Var.c)).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1029, new aa3(U, exc, (byte) 3));
                return;
            default:
                String str2 = gcc.a;
                ea3 ea3Var2 = ((n64) ((p30) lh2Var.c)).a.s;
                uj U2 = ea3Var2.U();
                ea3Var2.V(U2, 1014, new aa3(U2, exc, (byte) 25));
                return;
        }
    }
}
