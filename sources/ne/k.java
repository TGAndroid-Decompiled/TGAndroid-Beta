package ne;

import k7.h0;
public final class k extends p {
    public final int f15968g;
    public final String h;
    public final String f15969i;

    public k(int i10, String str, String str2) {
        this.f15968g = i10;
        this.h = str;
        this.f15969i = str2;
    }

    @Override
    public final void a(h0 h0Var) {
        switch (this.f15968g) {
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
        switch (this.f15968g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f15969i;
            default:
                return "destination=" + this.h + ", title=" + this.f15969i;
        }
    }
}
