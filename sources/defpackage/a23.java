package defpackage;
public final class a23 implements Runnable {
    public final byte a;
    public final d23 b;
    public final Throwable c;

    public a23(d23 d23Var, Throwable th, byte b) {
        this.a = b;
        this.b = d23Var;
        this.c = th;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Throwable th = this.c;
        d23 d23Var = this.b;
        switch (b) {
            case 0:
                o13 o13Var = d23Var.f;
                if (o13Var != null) {
                    o13Var.L(new z03(new h1((byte) 26), th.getMessage()));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var2 = d23Var.f;
                if (o13Var2 != null) {
                    o13Var2.L(new c03(th.getMessage(), (byte) 2));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
        }
    }
}
