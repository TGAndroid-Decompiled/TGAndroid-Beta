package ci;
public final class f extends dh.b {
    public final int f5066n;

    public f(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, d6Var);
        this.f5066n = 2;
    }

    @Override
    public int B() {
        switch (this.f5066n) {
            case 2:
                if (b()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.B();
        }
    }

    @Override
    public int a() {
        switch (this.f5066n) {
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
        switch (this.f5066n) {
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
        switch (this.f5066n) {
            case 2:
                if (b()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.c();
        }
    }

    public f(org.telegram.ui.ActionBar.d6 d6Var, int i10, float f7, int i11) {
        super(d6Var, i10, f7);
        this.f5066n = i11;
    }
}
