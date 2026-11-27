package defpackage;
public abstract class i3d extends cr2 {
    public final rg0 k;

    public i3d(rg0 rg0Var) {
        this.k = rg0Var;
    }

    public void A(asb asbVar) {
        n(new ci6(asbVar, (byte) 0));
    }

    public void B() {
        y(null, this.k);
    }

    @Override
    public boolean a(ft6 ft6Var) {
        return this.k.a(ft6Var);
    }

    @Override
    public asb h() {
        return this.k.h();
    }

    @Override
    public final ft6 i() {
        return this.k.i();
    }

    @Override
    public boolean j() {
        return this.k.j();
    }

    @Override
    public final void m(v2c v2cVar) {
        this.j = gcc.q(null);
        B();
    }

    @Override
    public void t(ft6 ft6Var) {
        this.k.t(ft6Var);
    }

    @Override
    public final vz6 u(Integer num, vz6 vz6Var) {
        Void r1 = (Void) num;
        return z(vz6Var);
    }

    @Override
    public final long v(long j, Integer num) {
        Void r3 = (Void) num;
        return j;
    }

    @Override
    public final int w(int i, Integer num) {
        Void r2 = (Void) num;
        return i;
    }

    @Override
    public final void x(Integer num, rg0 rg0Var, asb asbVar) {
        Void r1 = (Void) num;
        A(asbVar);
    }

    public vz6 z(vz6 vz6Var) {
        return vz6Var;
    }
}
