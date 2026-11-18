package gf;
public final class n extends mf.a {
    public final kf.n f13596a;
    public boolean f13597b;
    public int f13598c;

    public n(kf.n nVar) {
        this.f13596a = nVar;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (!(aVar instanceof kf.o)) {
            return false;
        }
        if (this.f13597b && this.f13598c == 1) {
            this.f13597b = false;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13596a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        if (gVar.h) {
            this.f13597b = true;
            this.f13598c = 0;
        } else if (this.f13597b) {
            this.f13598c++;
        }
        return a.a(gVar.f13547b);
    }
}
