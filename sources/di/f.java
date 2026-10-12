package di;
public final class f extends eh.b {
    public final int f6934n;

    public f(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, c6Var);
        this.f6934n = 2;
    }

    @Override
    public int G() {
        switch (this.f6934n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.G();
        }
    }

    @Override
    public boolean a() {
        switch (this.f6934n) {
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
        switch (this.f6934n) {
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
    public int q() {
        switch (this.f6934n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.q();
        }
    }

    public f(org.telegram.ui.ActionBar.c6 c6Var, int i10, float f7, int i11) {
        super(c6Var, i10, f7);
        this.f6934n = i11;
    }
}
