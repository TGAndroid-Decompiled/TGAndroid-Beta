package ne;

import k7.g0;
public final class k extends p {
    public final int f14934g;
    public final String h;
    public final String f14935i;

    public k(int i10, String str, String str2) {
        this.f14934g = i10;
        this.h = str;
        this.f14935i = str2;
    }

    @Override
    public final void a(g0 g0Var) {
        switch (this.f14934g) {
            case 0:
                g0Var.i(this);
                return;
            default:
                g0Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f14934g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f14935i;
            default:
                return "destination=" + this.h + ", title=" + this.f14935i;
        }
    }
}
