package defpackage;
public final class e23 implements Runnable {
    public final byte a;
    public final k23 b;

    public e23(k23 k23Var, byte b) {
        this.a = b;
        this.b = k23Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k23 k23Var = this.b;
        switch (b) {
            case 0:
                a33 a33Var = k23Var.f;
                if (a33Var != null) {
                    a33Var.A(new n13("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            default:
                a33 a33Var2 = k23Var.f;
                if (a33Var2 != null) {
                    a33Var2.A(new n13("No provider data returned.", (byte) 2));
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
        }
    }
}
