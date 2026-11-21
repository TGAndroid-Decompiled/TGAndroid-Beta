package gf;

import kf.r;
public final class o extends mf.a {
    public final kf.o f13628a = new kf.p();
    public final int f13629b;
    public boolean f13630c;

    public o(int i7) {
        this.f13629b = i7;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (this.f13630c) {
            kf.a aVar2 = (kf.a) ((kf.p) this.f13628a.f18263b);
            return true;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13628a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        boolean z10 = false;
        if (gVar.h) {
            if (((kf.p) this.f13628a.f18264c) != null) {
                kf.a e10 = gVar.h().e();
                this.f13630c = ((e10 instanceof r) || (e10 instanceof kf.o)) ? true : true;
                return a.a(gVar.f13578e);
            }
            return null;
        }
        int i7 = gVar.f13580g;
        int i10 = this.f13629b;
        if (i7 >= i10) {
            return new a(-1, gVar.f13577c + i10, false);
        }
        return null;
    }
}
