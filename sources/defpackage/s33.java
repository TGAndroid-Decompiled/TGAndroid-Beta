package defpackage;
public final class s33 implements Runnable {
    public final byte a;
    public final a33 b;
    public final vu4 c;

    public s33(a33 a33Var, vu4 vu4Var, byte b) {
        this.a = b;
        this.b = a33Var;
        this.c = vu4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        a33 a33Var = this.b;
        switch (b) {
            case 0:
                a33Var.A(obj);
                return;
            case 1:
                if (obj == null) {
                    obj = new uu4("No provider data returned", (byte) 2);
                }
                a33Var.A(obj);
                return;
            default:
                a33Var.A(obj);
                return;
        }
    }
}
