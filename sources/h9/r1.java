package h9;
public final class r1 extends a0 {
    public static final r1 f14046r = new r1();
    public final transient Object d;
    public final transient Object[] f14047e;
    public final transient int f14048f;
    public final transient int h;
    public final transient r1 f14049n;

    public r1() {
        this.d = null;
        this.f14047e = new Object[0];
        this.f14048f = 0;
        this.h = 0;
        this.f14049n = this;
    }

    @Override
    public final u1 c() {
        return new u1(this, this.f14047e, this.f14048f, this.h);
    }

    @Override
    public final v1 d() {
        return new v1(this, new w1(this.f14048f, this.h, this.f14047e));
    }

    @Override
    public final Object get(Object obj) {
        Object i7 = x1.i(this.d, this.f14047e, this.h, this.f14048f, obj);
        if (i7 == null) {
            return null;
        }
        return i7;
    }

    @Override
    public final int size() {
        return this.h;
    }

    public r1(int i7, Object[] objArr) {
        this.f14047e = objArr;
        this.h = i7;
        this.f14048f = 0;
        int o4 = i7 >= 2 ? t0.o(i7) : 0;
        Object h = x1.h(objArr, i7, o4, 0);
        if (!(h instanceof Object[])) {
            this.d = h;
            Object h7 = x1.h(objArr, i7, o4, 1);
            if (!(h7 instanceof Object[])) {
                this.f14049n = new r1(h7, objArr, i7, this);
                return;
            }
            throw ((k0) ((Object[]) h7)[2]).a();
        }
        throw ((k0) ((Object[]) h)[2]).a();
    }

    public r1(Object obj, Object[] objArr, int i7, r1 r1Var) {
        this.d = obj;
        this.f14047e = objArr;
        this.f14048f = 1;
        this.h = i7;
        this.f14049n = r1Var;
    }
}
