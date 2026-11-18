package kf;

import c8.f1;
public final class k extends p {
    public final int f18229g;
    public final String h;
    public final String f18230i;

    public k(int i7, String str, String str2) {
        this.f18229g = i7;
        this.h = str;
        this.f18230i = str2;
    }

    @Override
    public final void a(f1 f1Var) {
        switch (this.f18229g) {
            case 0:
                f1Var.i(this);
                return;
            default:
                f1Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f18229g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f18230i;
            default:
                return "destination=" + this.h + ", title=" + this.f18230i;
        }
    }
}
