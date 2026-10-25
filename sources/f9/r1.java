package f9;
public final class r1 extends a0 {
    public static final r1 f10332r = new r1();
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f10333f;
    public final transient int h;
    public final transient r1 f10334n;

    public r1() {
        this.d = null;
        this.e = new Object[0];
        this.f10333f = 0;
        this.h = 0;
        this.f10334n = this;
    }

    @Override
    public final u1 b() {
        return new u1(this, this.e, this.f10333f, this.h);
    }

    @Override
    public final v1 c() {
        return new v1(this, new w1(this.f10333f, this.h, this.e));
    }

    @Override
    public final Object get(Object obj) {
        Object h = x1.h(this.d, this.e, this.h, this.f10333f, obj);
        if (h == null) {
            return null;
        }
        return h;
    }

    @Override
    public final int size() {
        return this.h;
    }

    public r1(int i10, Object[] objArr) {
        this.e = objArr;
        this.h = i10;
        this.f10333f = 0;
        int s10 = i10 >= 2 ? t0.s(i10) : 0;
        Object g7 = x1.g(objArr, i10, s10, 0);
        if (!(g7 instanceof Object[])) {
            this.d = g7;
            Object g10 = x1.g(objArr, i10, s10, 1);
            if (!(g10 instanceof Object[])) {
                this.f10334n = new r1(g10, objArr, i10, this);
                return;
            }
            throw ((k0) ((Object[]) g10)[2]).a();
        }
        throw ((k0) ((Object[]) g7)[2]).a();
    }

    public r1(Object obj, Object[] objArr, int i10, r1 r1Var) {
        this.d = obj;
        this.e = objArr;
        this.f10333f = 1;
        this.h = i10;
        this.f10334n = r1Var;
    }
}
