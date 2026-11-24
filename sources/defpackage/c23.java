package defpackage;
public final class c23 implements Runnable {
    public final byte a;
    public final d23 b;
    public final d03 c;

    public c23(d23 d23Var, d03 d03Var, byte b) {
        this.a = b;
        this.b = d23Var;
        this.c = d03Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d03 d03Var = this.c;
        d23 d23Var = this.b;
        switch (b) {
            case 0:
                o13 o13Var = d23Var.f;
                if (o13Var != null) {
                    o13Var.L(d03Var);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            case 1:
                o13 o13Var2 = d23Var.f;
                if (o13Var2 != null) {
                    o13Var2.L(d03Var);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var3 = d23Var.f;
                if (o13Var3 != null) {
                    o13Var3.L(d03Var);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
        }
    }
}
