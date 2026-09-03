package ke;
public final class m extends pe.a {
    public final ne.n f10375a;
    public boolean f10376b;
    public int f10377c;

    public m(ne.n nVar) {
        this.f10375a = nVar;
    }

    @Override
    public final boolean b(ne.a aVar) {
        if (!(aVar instanceof ne.o)) {
            return false;
        }
        if (this.f10376b && this.f10377c == 1) {
            this.f10376b = false;
        }
        return true;
    }

    @Override
    public final ne.a e() {
        return this.f10375a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final j4.h h(e eVar) {
        if (eVar.h) {
            this.f10376b = true;
            this.f10377c = 0;
        } else if (this.f10376b) {
            this.f10377c++;
        }
        return j4.h.a(eVar.f10327b);
    }
}
