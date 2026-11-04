package df;

import gf.r;
public final class o extends jf.a {
    public final gf.o f8915a = new gf.p();
    public final int f8916b;
    public boolean f8917c;

    public o(int i3) {
        this.f8916b = i3;
    }

    @Override
    public final boolean b(gf.a aVar) {
        if (this.f8917c) {
            gf.a aVar2 = (gf.a) ((gf.p) this.f8915a.f12266b);
            return true;
        }
        return true;
    }

    @Override
    public final gf.a e() {
        return this.f8915a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        boolean z10 = false;
        if (gVar.h) {
            if (((gf.p) this.f8915a.f12267c) != null) {
                gf.a e10 = gVar.h().e();
                this.f8917c = ((e10 instanceof r) || (e10 instanceof gf.o)) ? true : true;
                return a.a(gVar.f8865e);
            }
            return null;
        }
        int i3 = gVar.f8867g;
        int i10 = this.f8916b;
        if (i3 >= i10) {
            return new a(-1, gVar.f8864c + i10, false);
        }
        return null;
    }
}
