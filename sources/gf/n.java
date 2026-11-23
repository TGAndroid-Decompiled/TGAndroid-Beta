package gf;
public final class n extends mf.a {
    public final kf.n f13591a;
    public boolean f13592b;
    public int f13593c;

    public n(kf.n nVar) {
        this.f13591a = nVar;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (!(aVar instanceof kf.o)) {
            return false;
        }
        if (this.f13592b && this.f13593c == 1) {
            this.f13592b = false;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13591a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        if (gVar.h) {
            this.f13592b = true;
            this.f13593c = 0;
        } else if (this.f13592b) {
            this.f13593c++;
        }
        return a.a(gVar.f13542b);
    }
}
