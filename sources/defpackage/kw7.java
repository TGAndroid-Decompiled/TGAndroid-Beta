package defpackage;
public final class kw7 implements Runnable {
    public final byte a;
    public final dx7 b;
    public final pp9 c;

    public kw7(dx7 dx7Var, pp9 pp9Var, byte b) {
        this.a = b;
        this.b = dx7Var;
        this.c = pp9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pp9 pp9Var = this.c;
        dx7 dx7Var = this.b;
        switch (b) {
            case 0:
                dx7Var.C0(pp9Var, true);
                return;
            default:
                dx7Var.B0(pp9Var);
                return;
        }
    }
}
