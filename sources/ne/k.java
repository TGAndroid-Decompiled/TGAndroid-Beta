package ne;

import k7.g0;
public final class k extends p {
    public final int f14949g;
    public final String h;
    public final String f14950i;

    public k(int i10, String str, String str2) {
        this.f14949g = i10;
        this.h = str;
        this.f14950i = str2;
    }

    @Override
    public final void a(g0 g0Var) {
        switch (this.f14949g) {
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
        switch (this.f14949g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f14950i;
            default:
                return "destination=" + this.h + ", title=" + this.f14950i;
        }
    }
}
