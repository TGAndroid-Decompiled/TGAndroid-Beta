package af;
public final class p extends ff.a {
    public final df.n f616a;
    public boolean f617b;
    public int f618c;

    public p(df.n nVar) {
        this.f616a = nVar;
    }

    @Override
    public final boolean b(df.a aVar) {
        if (!(aVar instanceof df.o)) {
            return false;
        }
        if (this.f617b && this.f618c == 1) {
            this.f617b = false;
        }
        return true;
    }

    @Override
    public final df.a e() {
        return this.f616a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(h hVar) {
        if (hVar.h) {
            this.f617b = true;
            this.f618c = 0;
        } else if (this.f617b) {
            this.f618c++;
        }
        return a.a(hVar.f568b);
    }
}
