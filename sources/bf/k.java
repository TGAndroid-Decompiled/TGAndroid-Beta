package bf;

import v7.k0;
public final class k extends p {
    public final int f3538g;
    public final String h;
    public final String f3539i;

    public k(int i10, String str, String str2) {
        this.f3538g = i10;
        this.h = str;
        this.f3539i = str2;
    }

    @Override
    public final void a(k0 k0Var) {
        switch (this.f3538g) {
            case 0:
                k0Var.i(this);
                return;
            default:
                k0Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f3538g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f3539i;
            default:
                return "destination=" + this.h + ", title=" + this.f3539i;
        }
    }
}
