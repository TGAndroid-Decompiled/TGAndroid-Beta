package af;
public final class p extends ff.a {
    public final df.n f620a;
    public boolean f621b;
    public int f622c;

    public p(df.n nVar) {
        this.f620a = nVar;
    }

    @Override
    public final boolean b(df.a aVar) {
        if (!(aVar instanceof df.o)) {
            return false;
        }
        if (this.f621b && this.f622c == 1) {
            this.f621b = false;
        }
        return true;
    }

    @Override
    public final df.a e() {
        return this.f620a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(h hVar) {
        if (hVar.h) {
            this.f621b = true;
            this.f622c = 0;
        } else if (this.f621b) {
            this.f622c++;
        }
        return a.a(hVar.f572b);
    }
}
