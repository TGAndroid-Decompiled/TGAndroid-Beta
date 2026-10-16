package df;

import v7.x6;
public final class k extends p {
    public final int f6525g;
    public final String h;
    public final String f6526i;

    public k(int i10, String str, String str2) {
        this.f6525g = i10;
        this.h = str;
        this.f6526i = str2;
    }

    @Override
    public final void a(x6 x6Var) {
        switch (this.f6525g) {
            case 0:
                x6Var.i(this);
                return;
            default:
                x6Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f6525g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f6526i;
            default:
                return "destination=" + this.h + ", title=" + this.f6526i;
        }
    }
}
