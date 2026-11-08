package kf;

import c8.b1;
public final class k extends p {
    public final int f17275g;
    public final String h;
    public final String f17276i;

    public k(int i7, String str, String str2) {
        this.f17275g = i7;
        this.h = str;
        this.f17276i = str2;
    }

    @Override
    public final void a(b1 b1Var) {
        switch (this.f17275g) {
            case 0:
                b1Var.i(this);
                return;
            default:
                b1Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f17275g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f17276i;
            default:
                return "destination=" + this.h + ", title=" + this.f17276i;
        }
    }
}
