package gf;

import kf.r;
public final class o extends mf.a {
    public final kf.o f13287a = new kf.p();
    public final int f13288b;
    public boolean f13289c;

    public o(int i7) {
        this.f13288b = i7;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (this.f13289c) {
            kf.a aVar2 = (kf.a) ((kf.p) this.f13287a.f17840b);
            return true;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13287a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        boolean z10 = false;
        if (gVar.h) {
            if (((kf.p) this.f13287a.f17841c) != null) {
                kf.a e10 = gVar.h().e();
                this.f13289c = ((e10 instanceof r) || (e10 instanceof kf.o)) ? true : true;
                return a.a(gVar.f13237e);
            }
            return null;
        }
        int i7 = gVar.f13239g;
        int i10 = this.f13288b;
        if (i7 >= i10) {
            return new a(-1, gVar.f13236c + i10, false);
        }
        return null;
    }
}
