package ge;

public final class m extends le.a {

    public final je.n f6915a;

    public boolean f6916b;

    public int f6917c;

    public m(je.n nVar) {
        this.f6915a = nVar;
    }

    @Override
    public final boolean b(je.a aVar) {
        if (!(aVar instanceof je.o)) {
            return false;
        }
        if (this.f6916b && this.f6917c == 1) {
            this.f6916b = false;
        }
        return true;
    }

    @Override
    public final je.a e() {
        return this.f6915a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final e4.h h(e eVar) {
        if (eVar.h) {
            this.f6916b = true;
            this.f6917c = 0;
        } else if (this.f6916b) {
            this.f6917c++;
        }
        return e4.h.a(eVar.f6863b);
    }
}
