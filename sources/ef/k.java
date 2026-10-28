package ef;

import a8.bc;
public final class k extends p {
    public final int f9930g;
    public final String h;
    public final String f9931i;

    public k(int i10, String str, String str2) {
        this.f9930g = i10;
        this.h = str;
        this.f9931i = str2;
    }

    @Override
    public final void a(bc bcVar) {
        switch (this.f9930g) {
            case 0:
                bcVar.i(this);
                return;
            default:
                bcVar.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f9930g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f9931i;
            default:
                return "destination=" + this.h + ", title=" + this.f9931i;
        }
    }
}
