package di;
public final class f extends eh.b {
    public final int f7188n;

    public f(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, f6Var);
        this.f7188n = 2;
    }

    @Override
    public int G() {
        switch (this.f7188n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.G();
        }
    }

    @Override
    public int J() {
        switch (this.f7188n) {
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
        switch (this.f7188n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.a();
        }
    }

    @Override
    public int p() {
        switch (this.f7188n) {
            case 2:
                if (a()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.p();
        }
    }

    public f(org.telegram.ui.ActionBar.f6 f6Var, int i10, float f7, int i11) {
        super(f6Var, i10, f7);
        this.f7188n = i11;
    }
}
