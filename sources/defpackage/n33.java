package defpackage;
public final class n33 implements Runnable {
    public final byte a;
    public final o33 b;
    public final o13 c;

    public n33(o33 o33Var, o13 o13Var, byte b) {
        this.a = b;
        this.b = o33Var;
        this.c = o13Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        o13 o13Var = this.c;
        o33 o33Var = this.b;
        switch (b) {
            case 0:
                a33 a33Var = o33Var.f;
                if (a33Var != null) {
                    a33Var.A(o13Var);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            case 1:
                a33 a33Var2 = o33Var.f;
                if (a33Var2 != null) {
                    a33Var2.A(o13Var);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            default:
                a33 a33Var3 = o33Var.f;
                if (a33Var3 != null) {
                    a33Var3.A(o13Var);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
        }
    }
}
