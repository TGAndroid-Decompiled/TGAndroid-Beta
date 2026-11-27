package defpackage;
public final class n13 implements Runnable {
    public final byte a;
    public final r13 b;
    public final w03 c;

    public n13(r13 r13Var, w03 w03Var, byte b) {
        this.a = b;
        this.b = r13Var;
        this.c = w03Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        r13 r13Var = this.b;
        switch (b) {
            case 0:
                h23 h23Var = r13Var.f;
                if (h23Var != null) {
                    h23Var.B(obj);
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            default:
                h23 h23Var2 = r13Var.f;
                if (h23Var2 != null) {
                    if (obj == null) {
                        obj = new v03("No provider data returned", (byte) 2);
                    }
                    h23Var2.B(obj);
                    return;
                }
                ur5.e("callback");
                throw null;
        }
    }
}
