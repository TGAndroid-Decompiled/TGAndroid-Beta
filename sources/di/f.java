package di;
public final class f extends eh.b {
    public final int f6937n;

    public f(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, c6Var);
        this.f6937n = 2;
    }

    @Override
    public int J() {
        switch (this.f6937n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.J();
        }
    }

    @Override
    public boolean a() {
        switch (this.f6937n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.a();
        }
    }

    @Override
    public int k() {
        switch (this.f6937n) {
            case 2:
                if (a()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.k();
        }
    }

    @Override
    public int w() {
        switch (this.f6937n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.w();
        }
    }

    public f(org.telegram.ui.ActionBar.c6 c6Var, int i10, float f7, int i11) {
        super(c6Var, i10, f7);
        this.f6937n = i11;
    }
}
