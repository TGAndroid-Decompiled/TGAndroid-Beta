package defpackage;
public final class rp1 implements ej8 {
    public boolean a = true;
    public final i49 b;

    public rp1(i49 i49Var) {
        this.b = i49Var;
    }

    @Override
    public final void a(float f, float f2) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        i49 i49Var = this.b;
        if (i == 0 && !this.a) {
            i49Var.p(false);
            this.a = true;
        } else if (f == 1.0f && this.a) {
            i49Var.setAlpha(1.0f - f2);
            if (f2 == 1.0f) {
                this.a = false;
            }
        }
    }
}
