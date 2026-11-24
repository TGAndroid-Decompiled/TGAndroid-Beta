package defpackage;
public final class m96 extends n96 implements b36 {
    public final e36 e;
    public final kj7 f;

    public m96(kj7 kj7Var, e36 e36Var, fq7 fq7Var) {
        super(kj7Var, fq7Var);
        this.f = kj7Var;
        this.e = e36Var;
    }

    @Override
    public final void b(e36 e36Var, u26 u26Var) {
        e36 e36Var2 = this.e;
        v26 v26Var = e36Var2.m().b;
        if (v26Var == v26.a) {
            this.f.h(this.a);
            return;
        }
        v26 v26Var2 = null;
        while (v26Var2 != v26Var) {
            a(e());
            v26Var2 = v26Var;
            v26Var = e36Var2.m().b;
        }
    }

    @Override
    public final void c() {
        this.e.m().b(this);
    }

    @Override
    public final boolean d(e36 e36Var) {
        if (this.e == e36Var) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        if (this.e.m().b.compareTo(v26.d) >= 0) {
            return true;
        }
        return false;
    }
}
