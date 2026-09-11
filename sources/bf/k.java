package bf;

import v7.i0;
public final class k extends p {
    public final int f2632g;
    public final String h;
    public final String f2633i;

    public k(int i10, String str, String str2) {
        this.f2632g = i10;
        this.h = str;
        this.f2633i = str2;
    }

    @Override
    public final void a(i0 i0Var) {
        switch (this.f2632g) {
            case 0:
                i0Var.i(this);
                return;
            default:
                i0Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f2632g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f2633i;
            default:
                return "destination=" + this.h + ", title=" + this.f2633i;
        }
    }
}
