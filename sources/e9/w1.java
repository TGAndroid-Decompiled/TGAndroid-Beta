package e9;
public final class w1 extends f0 {
    public static final w1 f8526r = new w1();
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f8527f;
    public final transient int h;
    public final transient w1 f8528n;

    public w1() {
        this.d = null;
        this.e = new Object[0];
        this.f8527f = 0;
        this.h = 0;
        this.f8528n = this;
    }

    @Override
    public final z1 b() {
        return new z1(this, this.e, this.f8527f, this.h);
    }

    @Override
    public final a2 c() {
        return new a2(this, new b2(this.f8527f, this.h, this.e));
    }

    @Override
    public final Object get(Object obj) {
        Object h = c2.h(this.d, this.e, this.h, this.f8527f, obj);
        if (h == null) {
            return null;
        }
        return h;
    }

    @Override
    public final int size() {
        return this.h;
    }

    public w1(int i10, Object[] objArr) {
        this.e = objArr;
        this.h = i10;
        this.f8527f = 0;
        int s10 = i10 >= 2 ? y0.s(i10) : 0;
        Object g10 = c2.g(objArr, i10, s10, 0);
        if (!(g10 instanceof Object[])) {
            this.d = g10;
            Object g11 = c2.g(objArr, i10, s10, 1);
            if (!(g11 instanceof Object[])) {
                this.f8528n = new w1(g11, objArr, i10, this);
                return;
            }
            throw ((p0) ((Object[]) g11)[2]).a();
        }
        throw ((p0) ((Object[]) g10)[2]).a();
    }

    public w1(Object obj, Object[] objArr, int i10, w1 w1Var) {
        this.d = obj;
        this.e = objArr;
        this.f8527f = 1;
        this.h = i10;
        this.f8528n = w1Var;
    }
}
