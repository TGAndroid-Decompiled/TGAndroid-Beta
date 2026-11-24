package defpackage;
public final class l33 implements Runnable {
    public final byte a;
    public final o33 b;
    public final Throwable c;

    public l33(o33 o33Var, Throwable th, byte b) {
        this.a = b;
        this.b = o33Var;
        this.c = th;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Throwable th = this.c;
        o33 o33Var = this.b;
        switch (b) {
            case 0:
                a33 a33Var = o33Var.f;
                if (a33Var != null) {
                    a33Var.A(new l23(new h1((byte) 26), th.getMessage()));
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            default:
                a33 a33Var2 = o33Var.f;
                if (a33Var2 != null) {
                    a33Var2.A(new n13(th.getMessage(), (byte) 2));
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
        }
    }
}
