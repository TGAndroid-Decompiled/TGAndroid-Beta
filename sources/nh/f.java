package nh;
public final class f extends og.b {
    public final int f17619n;

    public f(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, c6Var);
        this.f17619n = 2;
    }

    @Override
    public boolean a() {
        switch (this.f17619n) {
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
        switch (this.f17619n) {
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
    public int m() {
        switch (this.f17619n) {
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
    public int v() {
        switch (this.f17619n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.v();
        }
    }

    public f(org.telegram.ui.ActionBar.c6 c6Var, int i10, float f9, int i11) {
        super(c6Var, i10, f9);
        this.f17619n = i11;
    }
}
