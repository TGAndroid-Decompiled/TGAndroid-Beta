package h9;
public final class s1 extends a0 {
    public static final s1 f14093r = new s1();
    public final transient Object d;
    public final transient Object[] f14094e;
    public final transient int f14095f;
    public final transient int h;
    public final transient s1 f14096n;

    public s1() {
        this.d = null;
        this.f14094e = new Object[0];
        this.f14095f = 0;
        this.h = 0;
        this.f14096n = this;
    }

    @Override
    public final v1 c() {
        return new v1(this, this.f14094e, this.f14095f, this.h);
    }

    @Override
    public final w1 d() {
        return new w1(this, new x1(this.f14095f, this.h, this.f14094e));
    }

    @Override
    public final Object get(Object obj) {
        Object i7 = y1.i(this.d, this.f14094e, this.h, this.f14095f, obj);
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
        this.f14094e = objArr;
        this.h = i7;
        this.f14095f = 0;
        int o4 = i7 >= 2 ? t0.o(i7) : 0;
        Object h = y1.h(objArr, i7, o4, 0);
        if (!(h instanceof Object[])) {
            this.d = h;
            Object h7 = y1.h(objArr, i7, o4, 1);
            if (!(h7 instanceof Object[])) {
                this.f14096n = new s1(h7, objArr, i7, this);
                return;
            }
            throw ((k0) ((Object[]) h7)[2]).a();
        }
        throw ((k0) ((Object[]) h)[2]).a();
    }

    public s1(Object obj, Object[] objArr, int i7, s1 s1Var) {
        this.d = obj;
        this.f14094e = objArr;
        this.f14095f = 1;
        this.h = i7;
        this.f14096n = s1Var;
    }
}
