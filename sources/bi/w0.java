package bi;
public final class w0 implements r1.d {
    public final int f4168a;
    public final b1 f4169b;

    public w0(b1 b1Var, int i7) {
        this.f4168a = i7;
        this.f4169b = b1Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f4168a) {
            case 0:
                this.f4169b.b(f10 / 1000.0f);
                return;
            default:
                this.f4169b.b(Math.max(0.0f, f10 / 1000.0f));
                return;
        }
    }
}
