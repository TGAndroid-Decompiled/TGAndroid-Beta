package ke;
public final class m extends pe.a {
    public final ne.n f10396a;
    public boolean f10397b;
    public int f10398c;

    public m(ne.n nVar) {
        this.f10396a = nVar;
    }

    @Override
    public final boolean b(ne.a aVar) {
        if (!(aVar instanceof ne.o)) {
            return false;
        }
        if (this.f10397b && this.f10398c == 1) {
            this.f10397b = false;
        }
        return true;
    }

    @Override
    public final ne.a e() {
        return this.f10396a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final j4.h h(e eVar) {
        if (eVar.h) {
            this.f10397b = true;
            this.f10398c = 0;
        } else if (this.f10397b) {
            this.f10398c++;
        }
        return j4.h.a(eVar.f10348b);
    }
}
