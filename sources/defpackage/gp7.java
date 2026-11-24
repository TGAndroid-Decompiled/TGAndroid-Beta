package defpackage;
public final class gp7 extends bx9 {
    public final lp7 d;

    public gp7(lp7 lp7Var) {
        this.d = lp7Var;
    }

    @Override
    public final void c(boolean z) {
        this.d.a(!z);
    }

    @Override
    public final CharSequence d() {
        lp7 lp7Var = this.d;
        rac racVar = lp7Var.v0;
        int i = lp7Var.I;
        if (racVar != null) {
            return (CharSequence) racVar.a(Integer.valueOf(i));
        }
        return lp7Var.d(i);
    }
}
