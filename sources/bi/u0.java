package bi;
public final class u0 implements r1.d {
    public final int f4073a;
    public final x0 f4074b;

    public u0(x0 x0Var, int i7) {
        this.f4073a = i7;
        this.f4074b = x0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f4073a) {
            case 0:
                this.f4074b.b(f10 / 1000.0f);
                return;
            default:
                this.f4074b.b(Math.max(0.0f, f10 / 1000.0f));
                return;
        }
    }
}
