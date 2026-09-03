package ne;

import k7.h0;
public final class k extends p {
    public final int f15970g;
    public final String h;
    public final String f15971i;

    public k(int i10, String str, String str2) {
        this.f15970g = i10;
        this.h = str;
        this.f15971i = str2;
    }

    @Override
    public final void a(h0 h0Var) {
        switch (this.f15970g) {
            case 0:
                h0Var.i(this);
                return;
            default:
                h0Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f15970g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f15971i;
            default:
                return "destination=" + this.h + ", title=" + this.f15971i;
        }
    }
}
