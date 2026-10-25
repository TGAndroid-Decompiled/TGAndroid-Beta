package bf;
public final class n extends gf.a {
    public final ef.n f3967a;
    public boolean f3968b;
    public int f3969c;

    public n(ef.n nVar) {
        this.f3967a = nVar;
    }

    @Override
    public final boolean b(ef.a aVar) {
        if (!(aVar instanceof ef.o)) {
            return false;
        }
        if (this.f3968b && this.f3969c == 1) {
            this.f3968b = false;
        }
        return true;
    }

    @Override
    public final ef.a e() {
        return this.f3967a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        if (gVar.h) {
            this.f3968b = true;
            this.f3969c = 0;
        } else if (this.f3968b) {
            this.f3969c++;
        }
        return a.a(gVar.f3922b);
    }
}
