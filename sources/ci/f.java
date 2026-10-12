package ci;
public final class f extends dh.b {
    public final int f5058n;

    public f(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, c6Var);
        this.f5058n = 2;
    }

    @Override
    public boolean a() {
        switch (this.f5058n) {
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
        switch (this.f5058n) {
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
    public int d() {
        switch (this.f5058n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.d();
        }
    }

    @Override
    public int v() {
        switch (this.f5058n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.v();
        }
    }

    public f(org.telegram.ui.ActionBar.c6 c6Var, int i10, float f7, int i11) {
        super(c6Var, i10, f7);
        this.f5058n = i11;
    }
}
