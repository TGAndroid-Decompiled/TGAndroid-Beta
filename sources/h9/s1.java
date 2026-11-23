package h9;
public final class s1 extends a0 {
    public static final s1 f14096r = new s1();
    public final transient Object d;
    public final transient Object[] f14097e;
    public final transient int f14098f;
    public final transient int h;
    public final transient s1 f14099n;

    public s1() {
        this.d = null;
        this.f14097e = new Object[0];
        this.f14098f = 0;
        this.h = 0;
        this.f14099n = this;
    }

    @Override
    public final v1 c() {
        return new v1(this, this.f14097e, this.f14098f, this.h);
    }

    @Override
    public final w1 d() {
        return new w1(this, new x1(this.f14098f, this.h, this.f14097e));
    }

    @Override
    public final Object get(Object obj) {
        Object i7 = y1.i(this.d, this.f14097e, this.h, this.f14098f, obj);
        if (i7 == null) {
            return null;
        }
        return i7;
    }

    @Override
    public final int size() {
        return this.h;
    }

    public s1(int i7, Object[] objArr) {
        this.f14097e = objArr;
        this.h = i7;
        this.f14098f = 0;
        int o4 = i7 >= 2 ? t0.o(i7) : 0;
        Object h = y1.h(objArr, i7, o4, 0);
        if (!(h instanceof Object[])) {
            this.d = h;
            Object h7 = y1.h(objArr, i7, o4, 1);
            if (!(h7 instanceof Object[])) {
                this.f14099n = new s1(h7, objArr, i7, this);
                return;
            }
            throw ((k0) ((Object[]) h7)[2]).a();
        }
        throw ((k0) ((Object[]) h)[2]).a();
    }

    public s1(Object obj, Object[] objArr, int i7, s1 s1Var) {
        this.d = obj;
        this.f14097e = objArr;
        this.f14098f = 1;
        this.h = i7;
        this.f14099n = s1Var;
    }
}
