package gf;
public final class p extends mf.a {
    public final kf.o f13945a = new kf.p();
    public final int f13946b;
    public boolean f13947c;

    public p(int i7) {
        this.f13946b = i7;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (this.f13947c) {
            kf.a aVar2 = (kf.a) ((kf.p) this.f13945a.f17278b);
            return true;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13945a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(h hVar) {
        boolean z9 = false;
        if (hVar.h) {
            if (((kf.p) this.f13945a.f17279c) != null) {
                kf.a e10 = hVar.h().e();
                this.f13947c = ((e10 instanceof kf.r) || (e10 instanceof kf.o)) ? true : true;
                return a.a(hVar.f13895e);
            }
            return null;
        }
        int i7 = hVar.f13897g;
        int i10 = this.f13946b;
        if (i7 >= i10) {
            return new a(-1, hVar.f13894c + i10, false);
        }
        return null;
    }
}
