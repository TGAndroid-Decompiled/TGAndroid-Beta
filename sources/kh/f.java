package kh;
public final class f extends lg.b {
    public final int f15192n;

    public f(int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, b6Var);
        this.f15192n = 2;
    }

    @Override
    public boolean a() {
        switch (this.f15192n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.a();
        }
    }

    @Override
    public int e() {
        switch (this.f15192n) {
            case 2:
                if (a()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.e();
        }
    }

    @Override
    public int g() {
        switch (this.f15192n) {
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
    public int j() {
        switch (this.f15192n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.j();
        }
    }

    public f(org.telegram.ui.ActionBar.b6 b6Var, int i9, float f10, int i10) {
        super(b6Var, i9, f10);
        this.f15192n = i10;
    }
}
