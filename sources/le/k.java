package le;
public final class k extends p {
    public final int f15199g;
    public final String h;
    public final String f15200i;

    public k(int i10, String str, String str2) {
        this.f15199g = i10;
        this.h = str;
        this.f15200i = str2;
    }

    @Override
    public final void a(i7.t tVar) {
        switch (this.f15199g) {
            case 0:
                tVar.i(this);
                return;
            default:
                tVar.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f15199g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f15200i;
            default:
                return "destination=" + this.h + ", title=" + this.f15200i;
        }
    }
}
