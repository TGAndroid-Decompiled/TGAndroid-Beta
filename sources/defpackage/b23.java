package defpackage;
public final class b23 implements Runnable {
    public final byte a;
    public final d23 b;

    public b23(d23 d23Var, byte b) {
        this.a = b;
        this.b = d23Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d23 d23Var = this.b;
        switch (b) {
            case 0:
                o13 o13Var = d23Var.f;
                if (o13Var != null) {
                    o13Var.M(new c03("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var2 = d23Var.f;
                if (o13Var2 != null) {
                    o13Var2.M(new z03(new h1((byte) 26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
        }
    }
}
