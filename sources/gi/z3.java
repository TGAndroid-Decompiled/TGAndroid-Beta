package gi;
public final class z3 implements Runnable {
    public final int f14022a;
    public final m5 f14023b;
    public final ug.r1 f14024c;

    public z3(m5 m5Var, ug.r1 r1Var, int i3) {
        this.f14022a = i3;
        this.f14023b = m5Var;
        this.f14024c = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f14022a) {
            case 0:
                this.f14023b.A0(this.f14024c, true);
                return;
            default:
                this.f14023b.z0(this.f14024c);
                return;
        }
    }
}
