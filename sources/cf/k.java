package cf;

import v7.e5;
public final class k extends p {
    public final int f4646g;
    public final String h;
    public final String f4647i;

    public k(int i10, String str, String str2) {
        this.f4646g = i10;
        this.h = str;
        this.f4647i = str2;
    }

    @Override
    public final void a(e5 e5Var) {
        switch (this.f4646g) {
            case 0:
                e5Var.i(this);
                return;
            default:
                e5Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f4646g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f4647i;
            default:
                return "destination=" + this.h + ", title=" + this.f4647i;
        }
    }
}
