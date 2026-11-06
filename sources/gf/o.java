package gf;
public final class o extends mf.a {
    public final kf.n f13942a;
    public boolean f13943b;
    public int f13944c;

    public o(kf.n nVar) {
        this.f13942a = nVar;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (!(aVar instanceof kf.o)) {
            return false;
        }
        if (this.f13943b && this.f13944c == 1) {
            this.f13943b = false;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13942a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(h hVar) {
        if (hVar.h) {
            this.f13943b = true;
            this.f13944c = 0;
        } else if (this.f13943b) {
            this.f13944c++;
        }
        return a.a(hVar.f13893b);
    }
}
