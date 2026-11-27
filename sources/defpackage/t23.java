package defpackage;
public final class t23 implements Runnable {
    public final byte a;
    public final v23 b;

    public t23(v23 v23Var, byte b) {
        this.a = b;
        this.b = v23Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v23 v23Var = this.b;
        switch (b) {
            case 0:
                h23 h23Var = v23Var.f;
                if (h23Var != null) {
                    h23Var.B(new v03("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            default:
                h23 h23Var2 = v23Var.f;
                if (h23Var2 != null) {
                    h23Var2.B(new s13(new i1((byte) 26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
        }
    }
}
