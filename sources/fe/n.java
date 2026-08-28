package fe;

import ie.r;
public final class n extends ke.a {
    public final ie.o f6118a = new ie.p();
    public final int f6119b;
    public boolean f6120c;

    public n(int i9) {
        this.f6119b = i9;
    }

    @Override
    public final boolean b(ie.a aVar) {
        if (this.f6120c) {
            ie.a aVar2 = (ie.a) ((ie.p) this.f6118a.f11122b);
            return true;
        }
        return true;
    }

    @Override
    public final ie.a e() {
        return this.f6118a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final e4.h h(e eVar) {
        boolean z10 = false;
        if (eVar.h) {
            if (((ie.p) this.f6118a.f11123c) != null) {
                ie.a e10 = eVar.h().e();
                this.f6120c = ((e10 instanceof r) || (e10 instanceof ie.o)) ? true : true;
                return e4.h.a(eVar.f6065e);
            }
            return null;
        }
        int i9 = eVar.f6067g;
        int i10 = this.f6119b;
        if (i9 >= i10) {
            return new e4.h(-1, eVar.f6064c + i10, false);
        }
        return null;
    }
}
