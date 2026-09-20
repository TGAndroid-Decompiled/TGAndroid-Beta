package ci;
public final class f extends dh.b {
    public final int f4618n;

    public f(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, f6Var);
        this.f4618n = 2;
    }

    @Override
    public int a() {
        switch (this.f4618n) {
            case 2:
                if (b()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.a();
        }
    }

    @Override
    public boolean b() {
        switch (this.f4618n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override
    public int d() {
        switch (this.f4618n) {
            case 2:
                if (b()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.d();
        }
    }

    @Override
    public int m() {
        switch (this.f4618n) {
            case 2:
                if (b()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.m();
        }
    }

    public f(org.telegram.ui.ActionBar.f6 f6Var, int i10, float f7, int i11) {
        super(f6Var, i10, f7);
        this.f4618n = i11;
    }
}
