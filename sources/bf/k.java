package bf;

import v7.i0;
public final class k extends p {
    public final int f3546g;
    public final String h;
    public final String f3547i;

    public k(int i10, String str, String str2) {
        this.f3546g = i10;
        this.h = str;
        this.f3547i = str2;
    }

    @Override
    public final void a(i0 i0Var) {
        switch (this.f3546g) {
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
        switch (this.f3546g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f3547i;
            default:
                return "destination=" + this.h + ", title=" + this.f3547i;
        }
    }
}
