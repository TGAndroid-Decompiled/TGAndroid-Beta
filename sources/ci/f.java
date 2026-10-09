package ci;
public final class f extends dh.b {
    public final int f5060n;

    public f(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, e6Var);
        this.f5060n = 2;
    }

    @Override
    public boolean a() {
        switch (this.f5060n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.a();
        }
    }

    @Override
    public int d() {
        switch (this.f5060n) {
            case 2:
                if (a()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.d();
        }
    }

    @Override
    public int m() {
        switch (this.f5060n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.m();
        }
    }

    @Override
    public int q() {
        switch (this.f5060n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.q();
        }
    }

    public f(org.telegram.ui.ActionBar.e6 e6Var, int i10, float f7, int i11) {
        super(e6Var, i10, f7);
        this.f5060n = i11;
    }
}
