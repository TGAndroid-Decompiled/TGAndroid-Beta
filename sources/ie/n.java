package ie;

import le.r;
public final class n extends ne.a {
    public final le.o f8955a = new le.p();
    public final int f8956b;
    public boolean f8957c;

    public n(int i10) {
        this.f8956b = i10;
    }

    @Override
    public final boolean b(le.a aVar) {
        if (this.f8957c) {
            le.a aVar2 = (le.a) ((le.p) this.f8955a.f15205b);
            return true;
        }
        return true;
    }

    @Override
    public final le.a e() {
        return this.f8955a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final g4.h h(e eVar) {
        boolean z10 = false;
        if (eVar.h) {
            if (((le.p) this.f8955a.f15206c) != null) {
                le.a e10 = eVar.h().e();
                this.f8957c = ((e10 instanceof r) || (e10 instanceof le.o)) ? true : true;
                return g4.h.a(eVar.f8902e);
            }
            return null;
        }
        int i10 = eVar.f8904g;
        int i11 = this.f8956b;
        if (i10 >= i11) {
            return new g4.h(-1, eVar.f8901c + i11, false);
        }
        return null;
    }
}
