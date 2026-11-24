package defpackage;
public final class m76 extends n76 implements b16 {
    public final e16 e;
    public final hh7 f;

    public m76(hh7 hh7Var, e16 e16Var, co7 co7Var) {
        super(hh7Var, co7Var);
        this.f = hh7Var;
        this.e = e16Var;
    }

    @Override
    public final void b(e16 e16Var, u06 u06Var) {
        e16 e16Var2 = this.e;
        v06 v06Var = e16Var2.m().b;
        if (v06Var == v06.a) {
            this.f.h(this.a);
            return;
        }
        v06 v06Var2 = null;
        while (v06Var2 != v06Var) {
            a(e());
            v06Var2 = v06Var;
            v06Var = e16Var2.m().b;
        }
    }

    @Override
    public final void c() {
        this.e.m().b(this);
    }

    @Override
    public final boolean d(e16 e16Var) {
        if (this.e == e16Var) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        if (this.e.m().b.compareTo(v06.d) >= 0) {
            return true;
        }
        return false;
    }
}
