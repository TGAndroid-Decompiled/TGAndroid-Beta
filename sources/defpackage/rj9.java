package defpackage;
public final class rj9 {
    public final byte a;
    public final g29 b;

    public rj9(g29 g29Var, byte b) {
        this.a = b;
        this.b = g29Var;
    }

    public final void a(Exception exc) {
        byte b = this.a;
        g29 g29Var = this.b;
        switch (b) {
            case 0:
                ((ul9) g29Var.b).i.post(new kl9(g29Var, exc, (byte) 1));
                return;
            default:
                ((ul9) g29Var.b).i.post(new kl9(g29Var, exc, (byte) 0));
                return;
        }
    }
}
