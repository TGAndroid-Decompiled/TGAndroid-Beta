package ge;

import je.r;

public final class n extends le.a {

    public final je.o f6918a = new je.o();

    public final int f6919b;

    public boolean f6920c;

    public n(int i10) {
        this.f6919b = i10;
    }

    @Override
    public final boolean b(je.a aVar) {
        if (!this.f6920c) {
            return true;
        }
        return true;
    }

    @Override
    public final je.a e() {
        return this.f6918a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final e4.h h(e eVar) {
        if (eVar.h) {
            if (((je.p) this.f6918a.f12925c) == null) {
                return null;
            }
            je.a aVarE = eVar.h().e();
            this.f6920c = (aVarE instanceof r) || (aVarE instanceof je.o);
            return e4.h.a(eVar.f6865e);
        }
        int i10 = eVar.f6867g;
        int i11 = this.f6919b;
        if (i10 >= i11) {
            return new e4.h(-1, eVar.f6864c + i11, false);
        }
        return null;
    }
}
