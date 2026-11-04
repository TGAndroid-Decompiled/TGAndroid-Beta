package o4;
public final class x0 implements f1 {
    public final int f20896a;
    public final f1 f20897b;

    public x0(f1 f1Var, int i3) {
        this.f20896a = i3;
        this.f20897b = f1Var;
    }

    @Override
    public final Object i(e0 e0Var, v vVar, int i3) {
        switch (this.f20896a) {
            case 0:
                if (e0Var == null) {
                    h1.K0(null, vVar, i3, this.f20897b, new k2.q(vVar, i3, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return h1.K0(e0Var, vVar, i3, this.f20897b, new k2.y(e0Var, vVar, i3, 4));
        }
    }
}
