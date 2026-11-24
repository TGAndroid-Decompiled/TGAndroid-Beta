package defpackage;
public final class cp1 implements qf8 {
    public boolean a = true;
    public final t09 b;

    public cp1(t09 t09Var) {
        this.b = t09Var;
    }

    @Override
    public final void a(float f, float f2) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        t09 t09Var = this.b;
        if (i == 0 && !this.a) {
            t09Var.p(false);
            this.a = true;
        } else if (f == 1.0f && this.a) {
            t09Var.setAlpha(1.0f - f2);
            if (f2 == 1.0f) {
                this.a = false;
            }
        }
    }
}
