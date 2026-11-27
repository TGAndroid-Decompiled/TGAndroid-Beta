package defpackage;
public final class s23 implements Runnable {
    public final byte a;
    public final v23 b;
    public final Throwable c;

    public s23(v23 v23Var, Throwable th, byte b) {
        this.a = b;
        this.b = v23Var;
        this.c = th;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Throwable th = this.c;
        v23 v23Var = this.b;
        switch (b) {
            case 0:
                h23 h23Var = v23Var.f;
                if (h23Var != null) {
                    h23Var.B(new s13(new i1((byte) 26), th.getMessage()));
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            default:
                h23 h23Var2 = v23Var.f;
                if (h23Var2 != null) {
                    h23Var2.B(new v03(th.getMessage(), (byte) 2));
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
        }
    }
}
