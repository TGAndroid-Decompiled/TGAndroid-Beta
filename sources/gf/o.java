package gf;
public final class o extends mf.a {
    public final kf.n f13944a;
    public boolean f13945b;
    public int f13946c;

    public o(kf.n nVar) {
        this.f13944a = nVar;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (!(aVar instanceof kf.o)) {
            return false;
        }
        if (this.f13945b && this.f13946c == 1) {
            this.f13945b = false;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13944a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(h hVar) {
        if (hVar.h) {
            this.f13945b = true;
            this.f13946c = 0;
        } else if (this.f13945b) {
            this.f13946c++;
        }
        return a.a(hVar.f13895b);
    }
}
