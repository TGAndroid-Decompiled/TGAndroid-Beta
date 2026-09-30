package e9;
public final class z0 extends c0 {
    public static final z0 f8131r = new z0();
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f8132f;
    public final transient int h;
    public final transient z0 f8133n;

    public z0() {
        this.d = null;
        this.e = new Object[0];
        this.f8132f = 0;
        this.h = 0;
        this.f8133n = this;
    }

    @Override
    public final c1 b() {
        return new c1(this, this.e, this.f8132f, this.h);
    }

    @Override
    public final d1 c() {
        return new d1(this, new e1(this.f8132f, this.h, this.e));
    }

    @Override
    public final Object get(Object obj) {
        Object g10 = f1.g(this.d, this.e, this.h, this.f8132f, obj);
        if (g10 == null) {
            return null;
        }
        return g10;
    }

    @Override
    public final int size() {
        return this.h;
    }

    public z0(int i10, Object[] objArr) {
        this.e = objArr;
        this.h = i10;
        this.f8132f = 0;
        int t10 = i10 >= 2 ? m0.t(i10) : 0;
        Object f7 = f1.f(objArr, i10, t10, 0);
        if (!(f7 instanceof Object[])) {
            this.d = f7;
            Object f10 = f1.f(objArr, i10, t10, 1);
            if (!(f10 instanceof Object[])) {
                this.f8133n = new z0(f10, objArr, i10, this);
                return;
            }
            throw ((j0) ((Object[]) f10)[2]).a();
        }
        throw ((j0) ((Object[]) f7)[2]).a();
    }

    public z0(Object obj, Object[] objArr, int i10, z0 z0Var) {
        this.d = obj;
        this.e = objArr;
        this.f8132f = 1;
        this.h = i10;
        this.f8133n = z0Var;
    }
}
