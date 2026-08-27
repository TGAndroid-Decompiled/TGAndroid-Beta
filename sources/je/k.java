package je;

import g7.r8;

public final class k extends p {

    public final int f12918g;
    public final String h;

    public final String f12919i;

    public k(int i10, String str, String str2) {
        this.f12918g = i10;
        this.h = str;
        this.f12919i = str2;
    }

    @Override
    public final void a(r8 r8Var) {
        switch (this.f12918g) {
            case 0:
                r8Var.i(this);
                break;
            default:
                r8Var.s(this);
                break;
        }
    }

    @Override
    public final String f() {
        switch (this.f12918g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f12919i;
            default:
                return "destination=" + this.h + ", title=" + this.f12919i;
        }
    }
}
