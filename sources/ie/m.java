package ie;
public final class m extends ne.a {
    public final le.n f8952a;
    public boolean f8953b;
    public int f8954c;

    public m(le.n nVar) {
        this.f8952a = nVar;
    }

    @Override
    public final boolean b(le.a aVar) {
        if (!(aVar instanceof le.o)) {
            return false;
        }
        if (this.f8953b && this.f8954c == 1) {
            this.f8953b = false;
        }
        return true;
    }

    @Override
    public final le.a e() {
        return this.f8952a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final g4.h h(e eVar) {
        if (eVar.h) {
            this.f8953b = true;
            this.f8954c = 0;
        } else if (this.f8953b) {
            this.f8954c++;
        }
        return g4.h.a(eVar.f8900b);
    }
}
