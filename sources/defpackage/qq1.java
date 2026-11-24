package defpackage;
public final class qq1 implements sh8 {
    public boolean a = true;
    public final v29 b;

    public qq1(v29 v29Var) {
        this.b = v29Var;
    }

    @Override
    public final void a(float f, float f2) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        v29 v29Var = this.b;
        if (i == 0 && !this.a) {
            v29Var.p(false);
            this.a = true;
        } else if (f == 1.0f && this.a) {
            v29Var.setAlpha(1.0f - f2);
            if (f2 == 1.0f) {
                this.a = false;
            }
        }
    }
}
