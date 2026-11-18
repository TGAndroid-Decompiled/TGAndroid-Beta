package gf;
public final class n extends mf.a {
    public final kf.n f13599a;
    public boolean f13600b;
    public int f13601c;

    public n(kf.n nVar) {
        this.f13599a = nVar;
    }

    @Override
    public final boolean b(kf.a aVar) {
        if (!(aVar instanceof kf.o)) {
            return false;
        }
        if (this.f13600b && this.f13601c == 1) {
            this.f13600b = false;
        }
        return true;
    }

    @Override
    public final kf.a e() {
        return this.f13599a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        if (gVar.h) {
            this.f13600b = true;
            this.f13601c = 0;
        } else if (this.f13600b) {
            this.f13601c++;
        }
        return a.a(gVar.f13550b);
    }
}
