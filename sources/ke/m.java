package ke;
public final class m extends pe.a {
    public final ne.n f11172a;
    public boolean f11173b;
    public int f11174c;

    public m(ne.n nVar) {
        this.f11172a = nVar;
    }

    @Override
    public final boolean b(ne.a aVar) {
        if (!(aVar instanceof ne.o)) {
            return false;
        }
        if (this.f11173b && this.f11174c == 1) {
            this.f11173b = false;
        }
        return true;
    }

    @Override
    public final ne.a e() {
        return this.f11172a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final j4.h h(e eVar) {
        if (eVar.h) {
            this.f11173b = true;
            this.f11174c = 0;
        } else if (this.f11173b) {
            this.f11174c++;
        }
        return j4.h.a(eVar.f11120b);
    }
}
