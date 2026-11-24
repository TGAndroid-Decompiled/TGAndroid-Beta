package defpackage;
public final class v59 extends cm5 {
    public static final v59 r = new v59();
    public final transient Object d;
    public final transient Object[] e;
    public final transient boolean f;
    public final transient int h;
    public final transient v59 n;

    public v59(int i, Object[] objArr) {
        int i2;
        this.e = objArr;
        this.h = i;
        this.f = false;
        if (i >= 2) {
            i2 = ym5.o(i);
        } else {
            i2 = 0;
        }
        Object h = b69.h(objArr, i, i2, 0);
        if (!(h instanceof Object[])) {
            this.d = h;
            Object h2 = b69.h(objArr, i, i2, 1);
            if (!(h2 instanceof Object[])) {
                this.n = new v59(h2, objArr, i, this);
                return;
            }
            throw ((pm5) ((Object[]) h2)[2]).a();
        }
        throw ((pm5) ((Object[]) h)[2]).a();
    }

    @Override
    public final y59 c() {
        boolean z = this.f;
        return new y59(this, this.e, z ? 1 : 0, this.h);
    }

    @Override
    public final z59 d() {
        boolean z = this.f;
        return new z59(this, new a69(z ? 1 : 0, this.h, this.e));
    }

    @Override
    public final Object get(Object obj) {
        Object i = b69.i(this.d, this.e, this.h, this.f ? 1 : 0, obj);
        if (i == null) {
            return null;
        }
        return i;
    }

    @Override
    public final int size() {
        return this.h;
    }

    public v59() {
        this.d = null;
        this.e = new Object[0];
        this.f = false;
        this.h = 0;
        this.n = this;
    }

    public v59(Object obj, Object[] objArr, int i, v59 v59Var) {
        this.d = obj;
        this.e = objArr;
        this.f = true;
        this.h = i;
        this.n = v59Var;
    }
}
