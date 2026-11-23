package gf;

import kf.r;
public final class o extends mf.a {
    public final kf.o f13594a = new kf.p();
    public final int f13595b;
    public boolean f13596c;

    public o(int i7) {
        this.f13595b = i7;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (this.f13596c) {
            kf.a aVar2 = (kf.a) ((kf.p) this.f13594a.f18229b);
            return true;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13594a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        boolean z10 = false;
        if (gVar.h) {
            if (((kf.p) this.f13594a.f18230c) != null) {
                kf.a e10 = gVar.h().e();
                this.f13596c = ((e10 instanceof r) || (e10 instanceof kf.o)) ? true : true;
                return a.a(gVar.f13544e);
            }
            return null;
        }
        int i7 = gVar.f13546g;
        int i10 = this.f13595b;
        if (i7 >= i10) {
            return new a(-1, gVar.f13543c + i10, false);
        }
        return null;
    }
}
