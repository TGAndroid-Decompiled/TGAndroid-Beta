package defpackage;
public final class bb0 extends c6 {
    public final byte a;
    public final mb0 b;

    public bb0(mb0 mb0Var, byte b) {
        this.a = b;
        this.b = mb0Var;
    }

    @Override
    public final void b(int i) {
        byte b = this.a;
        mb0 mb0Var = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    mb0Var.h0();
                    return;
                }
                return;
            default:
                if (i == -1) {
                    mb0Var.h0();
                }
                if (i == 1) {
                    mb0Var.j0();
                    return;
                }
                return;
        }
    }
}
