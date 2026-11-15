package gf;
public final class n extends mf.a {
    public final kf.n f13284a;
    public boolean f13285b;
    public int f13286c;

    public n(kf.n nVar) {
        this.f13284a = nVar;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (!(aVar instanceof kf.o)) {
            return false;
        }
        if (this.f13285b && this.f13286c == 1) {
            this.f13285b = false;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13284a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        if (gVar.h) {
            this.f13285b = true;
            this.f13286c = 0;
        } else if (this.f13285b) {
            this.f13286c++;
        }
        return a.a(gVar.f13235b);
    }
}
