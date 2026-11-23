package gf;
public final class n extends mf.a {
    public final kf.n f13628a;
    public boolean f13629b;
    public int f13630c;

    public n(kf.n nVar) {
        this.f13628a = nVar;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (!(aVar instanceof kf.o)) {
            return false;
        }
        if (this.f13629b && this.f13630c == 1) {
            this.f13629b = false;
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
        if (gVar.h) {
            this.f13629b = true;
            this.f13630c = 0;
        } else if (this.f13629b) {
            this.f13630c++;
        }
        return a.a(gVar.f13579b);
    }
}
