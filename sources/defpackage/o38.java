package defpackage;
public final class o38 implements Runnable {
    public final byte a;
    public final a48 b;

    public o38(a48 a48Var, byte b) {
        this.a = b;
        this.b = a48Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        a48 a48Var = this.b;
        switch (b) {
            case 0:
                if (a48Var.H) {
                    a48Var.b.invalidate();
                    return;
                }
                return;
            case 1:
                a48Var.h();
                return;
            default:
                int i = a48.r0;
                a48Var.h();
                return;
        }
    }
}
