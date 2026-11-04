package df;
public final class n extends jf.a {
    public final gf.n f8912a;
    public boolean f8913b;
    public int f8914c;

    public n(gf.n nVar) {
        this.f8912a = nVar;
    }

    @Override
    public final boolean b(gf.a aVar) {
        if (!(aVar instanceof gf.o)) {
            return false;
        }
        if (this.f8913b && this.f8914c == 1) {
            this.f8913b = false;
        }
        return true;
    }

    @Override
    public final gf.a e() {
        return this.f8912a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        if (gVar.h) {
            this.f8913b = true;
            this.f8914c = 0;
        } else if (this.f8913b) {
            this.f8914c++;
        }
        return a.a(gVar.f8863b);
    }
}
