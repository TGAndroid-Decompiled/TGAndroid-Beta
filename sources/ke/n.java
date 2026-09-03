package ke;

import ne.r;
public final class n extends pe.a {
    public final ne.o f10378a = new ne.p();
    public final int f10379b;
    public boolean f10380c;

    public n(int i10) {
        this.f10379b = i10;
    }

    @Override
    public final boolean b(ne.a aVar) {
        if (this.f10380c) {
            ne.a aVar2 = (ne.a) ((ne.p) this.f10378a.f14940b);
            return true;
        }
        return true;
    }

    @Override
    public final ne.a e() {
        return this.f10378a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final j4.h h(e eVar) {
        boolean z4 = false;
        if (eVar.h) {
            if (((ne.p) this.f10378a.f14941c) != null) {
                ne.a e = eVar.h().e();
                this.f10380c = ((e instanceof r) || (e instanceof ne.o)) ? true : true;
                return j4.h.a(eVar.e);
            }
            return null;
        }
        int i10 = eVar.f10330g;
        int i11 = this.f10379b;
        if (i10 >= i11) {
            return new j4.h(-1, eVar.f10328c + i11, false);
        }
        return null;
    }
}
