package ei;
public final class f extends eh.b {
    public final int f9002r;

    public f(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, g6Var);
        this.f9002r = 2;
    }

    @Override
    public int H() {
        switch (this.f9002r) {
            case 2:
                if (b()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.H();
        }
    }

    @Override
    public boolean b() {
        switch (this.f9002r) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override
    public int h() {
        switch (this.f9002r) {
            case 2:
                if (b()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.h();
        }
    }

    @Override
    public int u() {
        switch (this.f9002r) {
            case 2:
                if (b()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.u();
        }
    }

    public f(org.telegram.ui.ActionBar.g6 g6Var, int i10, float f7, int i11) {
        super(g6Var, i10, f7);
        this.f9002r = i11;
    }
}
