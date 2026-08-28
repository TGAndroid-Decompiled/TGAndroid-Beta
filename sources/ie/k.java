package ie;

import f7.p8;
public final class k extends p {
    public final int f11116g;
    public final String h;
    public final String f11117i;

    public k(int i9, String str, String str2) {
        this.f11116g = i9;
        this.h = str;
        this.f11117i = str2;
    }

    @Override
    public final void a(p8 p8Var) {
        switch (this.f11116g) {
            case 0:
                p8Var.i(this);
                return;
            default:
                p8Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f11116g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f11117i;
            default:
                return "destination=" + this.h + ", title=" + this.f11117i;
        }
    }
}
