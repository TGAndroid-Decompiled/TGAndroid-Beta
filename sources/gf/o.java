package gf;

import kf.r;
public final class o extends mf.a {
    public final kf.o f13631a = new kf.p();
    public final int f13632b;
    public boolean f13633c;

    public o(int i7) {
        this.f13632b = i7;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (this.f13633c) {
            kf.a aVar2 = (kf.a) ((kf.p) this.f13631a.f18266b);
            return true;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13631a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        boolean z10 = false;
        if (gVar.h) {
            if (((kf.p) this.f13631a.f18267c) != null) {
                kf.a e10 = gVar.h().e();
                this.f13633c = ((e10 instanceof r) || (e10 instanceof kf.o)) ? true : true;
                return a.a(gVar.f13581e);
            }
            return null;
        }
        int i7 = gVar.f13583g;
        int i10 = this.f13632b;
        if (i7 >= i10) {
            return new a(-1, gVar.f13580c + i10, false);
        }
        return null;
    }
}
