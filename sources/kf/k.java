package kf;

import c8.g1;
public final class k extends p {
    public final int f18223g;
    public final String h;
    public final String f18224i;

    public k(int i7, String str, String str2) {
        this.f18223g = i7;
        this.h = str;
        this.f18224i = str2;
    }

    @Override
    public final void a(g1 g1Var) {
        switch (this.f18223g) {
            case 0:
                g1Var.i(this);
                return;
            default:
                g1Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f18223g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f18224i;
            default:
                return "destination=" + this.h + ", title=" + this.f18224i;
        }
    }
}
