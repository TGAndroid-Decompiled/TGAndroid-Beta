package ke;

import ne.r;
public final class n extends pe.a {
    public final ne.o f11175a = new ne.p();
    public final int f11176b;
    public boolean f11177c;

    public n(int i10) {
        this.f11176b = i10;
    }

    @Override
    public final boolean b(ne.a aVar) {
        if (this.f11177c) {
            ne.a aVar2 = (ne.a) ((ne.p) this.f11175a.f15974b);
            return true;
        }
        return true;
    }

    @Override
    public final ne.a e() {
        return this.f11175a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final j4.h h(e eVar) {
        boolean z4 = false;
        if (eVar.h) {
            if (((ne.p) this.f11175a.f15975c) != null) {
                ne.a e6 = eVar.h().e();
                this.f11177c = ((e6 instanceof r) || (e6 instanceof ne.o)) ? true : true;
                return j4.h.a(eVar.f11122e);
            }
            return null;
        }
        int i10 = eVar.f11124g;
        int i11 = this.f11176b;
        if (i10 >= i11) {
            return new j4.h(-1, eVar.f11121c + i11, false);
        }
        return null;
    }
}
