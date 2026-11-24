package defpackage;
public final class tl9 {
    public final byte a;
    public final et8 b;

    public tl9(et8 et8Var, byte b) {
        this.a = b;
        this.b = et8Var;
    }

    public final void a(Exception exc) {
        byte b = this.a;
        et8 et8Var = this.b;
        switch (b) {
            case 0:
                ((un9) et8Var.b).i.post(new kn9(et8Var, exc, (byte) 1));
                return;
            default:
                ((un9) et8Var.b).i.post(new kn9(et8Var, exc, (byte) 0));
                return;
        }
    }
}
