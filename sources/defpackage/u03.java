package defpackage;
public final class u03 implements Runnable {
    public final byte a;
    public final y03 b;
    public final d03 c;

    public u03(y03 y03Var, d03 d03Var, byte b) {
        this.a = b;
        this.b = y03Var;
        this.c = d03Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        y03 y03Var = this.b;
        switch (b) {
            case 0:
                o13 o13Var = y03Var.f;
                if (o13Var != null) {
                    o13Var.L(obj);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var2 = y03Var.f;
                if (o13Var2 != null) {
                    if (obj == null) {
                        obj = new c03("No provider data returned", (byte) 2);
                    }
                    o13Var2.L(obj);
                    return;
                }
                rp5.e("callback");
                throw null;
        }
    }
}
