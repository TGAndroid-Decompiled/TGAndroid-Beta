package ci;
public final class f extends dh.b {
    public final int f4616n;

    public f(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, f6Var);
        this.f4616n = 2;
    }

    @Override
    public boolean a() {
        switch (this.f4616n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.a();
        }
    }

    @Override
    public int b() {
        switch (this.f4616n) {
            case 2:
                if (a()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.b();
        }
    }

    @Override
    public int g() {
        switch (this.f4616n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.g();
        }
    }

    @Override
    public int x() {
        switch (this.f4616n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.x();
        }
    }

    public f(org.telegram.ui.ActionBar.f6 f6Var, int i10, float f7, int i11) {
        super(f6Var, i10, f7);
        this.f4616n = i11;
    }
}
