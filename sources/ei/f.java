package ei;
public final class f extends eh.b {
    public final int f8993n;

    public f(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, d6Var);
        this.f8993n = 2;
    }

    @Override
    public int E() {
        switch (this.f8993n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.E();
        }
    }

    @Override
    public boolean a() {
        switch (this.f8993n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.a();
        }
    }

    @Override
    public int h() {
        switch (this.f8993n) {
            case 2:
                if (a()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.h();
        }
    }

    @Override
    public int u() {
        switch (this.f8993n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.u();
        }
    }

    public f(org.telegram.ui.ActionBar.d6 d6Var, int i10, float f7, int i11) {
        super(d6Var, i10, f7);
        this.f8993n = i11;
    }
}
