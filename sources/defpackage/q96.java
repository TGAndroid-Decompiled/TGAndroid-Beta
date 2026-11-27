package defpackage;
public final class q96 extends r96 implements f36 {
    public final i36 e;
    public final rj7 f;

    public q96(rj7 rj7Var, i36 i36Var, cr7 cr7Var) {
        super(rj7Var, cr7Var);
        this.f = rj7Var;
        this.e = i36Var;
    }

    @Override
    public final void b(i36 i36Var, y26 y26Var) {
        i36 i36Var2 = this.e;
        z26 z26Var = i36Var2.m().b;
        if (z26Var == z26.a) {
            this.f.h(this.a);
            return;
        }
        z26 z26Var2 = null;
        while (z26Var2 != z26Var) {
            a(e());
            z26Var2 = z26Var;
            z26Var = i36Var2.m().b;
        }
    }

    @Override
    public final void c() {
        this.e.m().b(this);
    }

    @Override
    public final boolean d(i36 i36Var) {
        if (this.e == i36Var) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        if (this.e.m().b.compareTo(z26.d) >= 0) {
            return true;
        }
        return false;
    }
}
