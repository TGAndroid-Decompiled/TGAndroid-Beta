package fe;
public final class m extends ke.a {
    public final ie.n f6115a;
    public boolean f6116b;
    public int f6117c;

    public m(ie.n nVar) {
        this.f6115a = nVar;
    }

    @Override
    public final boolean b(ie.a aVar) {
        if (!(aVar instanceof ie.o)) {
            return false;
        }
        if (this.f6116b && this.f6117c == 1) {
            this.f6116b = false;
        }
        return true;
    }

    @Override
    public final ie.a e() {
        return this.f6115a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final e4.h h(e eVar) {
        if (eVar.h) {
            this.f6116b = true;
            this.f6117c = 0;
        } else if (this.f6116b) {
            this.f6117c++;
        }
        return e4.h.a(eVar.f6063b);
    }
}
