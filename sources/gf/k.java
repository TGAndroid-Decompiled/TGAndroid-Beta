package gf;

import b8.lc;
public final class k extends p {
    public final int f12260g;
    public final String h;
    public final String f12261i;

    public k(int i3, String str, String str2) {
        this.f12260g = i3;
        this.h = str;
        this.f12261i = str2;
    }

    @Override
    public final void a(lc lcVar) {
        switch (this.f12260g) {
            case 0:
                lcVar.i(this);
                return;
            default:
                lcVar.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f12260g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f12261i;
            default:
                return "destination=" + this.h + ", title=" + this.f12261i;
        }
    }
}
