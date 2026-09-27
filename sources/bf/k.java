package bf;

import v7.j0;
public final class k extends p {
    public final int f3540g;
    public final String h;
    public final String f3541i;

    public k(int i10, String str, String str2) {
        this.f3540g = i10;
        this.h = str;
        this.f3541i = str2;
    }

    @Override
    public final void a(j0 j0Var) {
        switch (this.f3540g) {
            case 0:
                j0Var.i(this);
                return;
            default:
                j0Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f3540g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f3541i;
            default:
                return "destination=" + this.h + ", title=" + this.f3541i;
        }
    }
}
