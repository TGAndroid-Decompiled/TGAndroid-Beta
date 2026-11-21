package gf;
public final class n extends mf.a {
    public final kf.n f13625a;
    public boolean f13626b;
    public int f13627c;

    public n(kf.n nVar) {
        this.f13625a = nVar;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (!(aVar instanceof kf.o)) {
            return false;
        }
        if (this.f13626b && this.f13627c == 1) {
            this.f13626b = false;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13625a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        if (gVar.h) {
            this.f13626b = true;
            this.f13627c = 0;
        } else if (this.f13626b) {
            this.f13627c++;
        }
        return a.a(gVar.f13576b);
    }
}
