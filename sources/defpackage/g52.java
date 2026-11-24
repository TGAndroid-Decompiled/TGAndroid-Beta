package defpackage;
public final class g52 implements Runnable {
    public final byte a;
    public final n52 b;
    public final uj5 c;

    public g52(n52 n52Var, uj5 uj5Var, byte b) {
        this.a = b;
        this.b = n52Var;
        this.c = uj5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uj5 uj5Var = this.c;
        n52 n52Var = this.b;
        switch (b) {
            case 0:
                try {
                    ((sm2) uj5Var).F();
                } catch (Exception unused) {
                }
                gm.c3(new g52(n52Var, uj5Var, (byte) 1));
                return;
            default:
                n52Var.T(uj5Var);
                return;
        }
    }
}
