package gf;
public final class p extends mf.a {
    public final kf.o f13947a = new kf.p();
    public final int f13948b;
    public boolean f13949c;

    public p(int i7) {
        this.f13948b = i7;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (this.f13949c) {
            kf.a aVar2 = (kf.a) ((kf.p) this.f13947a.f17281b);
            return true;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13947a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(h hVar) {
        boolean z9 = false;
        if (hVar.h) {
            if (((kf.p) this.f13947a.f17282c) != null) {
                kf.a e10 = hVar.h().e();
                this.f13949c = ((e10 instanceof kf.r) || (e10 instanceof kf.o)) ? true : true;
                return a.a(hVar.f13897e);
            }
            return null;
        }
        int i7 = hVar.f13899g;
        int i10 = this.f13948b;
        if (i7 >= i10) {
            return new a(-1, hVar.f13896c + i10, false);
        }
        return null;
    }
}
