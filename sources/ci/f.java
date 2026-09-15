package ci;
public final class f extends dh.b {
    public final int f4612n;

    public f(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, e6Var);
        this.f4612n = 2;
    }

    @Override
    public int a() {
        switch (this.f4612n) {
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
        switch (this.f4612n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override
    public int c() {
        switch (this.f4612n) {
            case 2:
                if (b()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.c();
        }
    }

    @Override
    public int m() {
        switch (this.f4612n) {
            case 2:
                if (b()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.m();
        }
    }

    public f(org.telegram.ui.ActionBar.e6 e6Var, int i10, float f7, int i11) {
        super(e6Var, i10, f7);
        this.f4612n = i11;
    }
}
