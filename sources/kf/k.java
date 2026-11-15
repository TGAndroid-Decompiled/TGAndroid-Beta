package kf;

import c8.d1;
public final class k extends p {
    public final int f17834g;
    public final String h;
    public final String f17835i;

    public k(int i7, String str, String str2) {
        this.f17834g = i7;
        this.h = str;
        this.f17835i = str2;
    }

    @Override
    public final void a(d1 d1Var) {
        switch (this.f17834g) {
            case 0:
                d1Var.i(this);
                return;
            default:
                d1Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f17834g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f17835i;
            default:
                return "destination=" + this.h + ", title=" + this.f17835i;
        }
    }
}
