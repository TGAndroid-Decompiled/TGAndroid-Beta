package defpackage;
public final class vn5 implements Runnable {
    public final byte a;
    public final yn5 b;

    public vn5(yn5 yn5Var, byte b) {
        this.a = b;
        this.b = yn5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yn5 yn5Var = this.b;
        switch (b) {
            case 0:
                m01 m01Var = yn5Var.A;
                if (m01Var != null) {
                    yn5Var.a.g(m01Var);
                    yn5Var.A = null;
                    return;
                }
                return;
            default:
                yn5Var.a(null, true, null);
                return;
        }
    }
}
