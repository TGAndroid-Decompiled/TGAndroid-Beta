package defpackage;
public final class db0 extends d6 {
    public final byte a;
    public final ob0 b;

    public db0(ob0 ob0Var, byte b) {
        this.a = b;
        this.b = ob0Var;
    }

    @Override
    public final void b(int i) {
        byte b = this.a;
        ob0 ob0Var = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ob0Var.h0();
                    return;
                }
                return;
            default:
                if (i == -1) {
                    ob0Var.h0();
                }
                if (i == 1) {
                    ob0Var.j0();
                    return;
                }
                return;
        }
    }
}
