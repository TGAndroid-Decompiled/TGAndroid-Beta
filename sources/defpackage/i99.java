package defpackage;
public final class i99 extends fo5 {
    public static final i99 r = new i99();
    public final transient Object d;
    public final transient Object[] e;
    public final transient boolean f;
    public final transient int h;
    public final transient i99 n;

    public i99(int i, Object[] objArr) {
        int i2;
        this.e = objArr;
        this.h = i;
        this.f = false;
        if (i >= 2) {
            i2 = bp5.o(i);
        } else {
            i2 = 0;
        }
        Object h = o99.h(objArr, i, i2, 0);
        if (!(h instanceof Object[])) {
            this.d = h;
            Object h2 = o99.h(objArr, i, i2, 1);
            if (!(h2 instanceof Object[])) {
                this.n = new i99(h2, objArr, i, this);
                return;
            }
            throw ((so5) ((Object[]) h2)[2]).a();
        }
        throw ((so5) ((Object[]) h)[2]).a();
    }

    @Override
    public final l99 c() {
        boolean z = this.f;
        return new l99(this, this.e, z ? 1 : 0, this.h);
    }

    @Override
    public final m99 d() {
        boolean z = this.f;
        return new m99(this, new n99(z ? 1 : 0, this.h, this.e));
    }

    @Override
    public final Object get(Object obj) {
        Object i = o99.i(this.d, this.e, this.h, this.f ? 1 : 0, obj);
        if (i == null) {
            return null;
        }
        return i;
    }

    @Override
    public final int size() {
        return this.h;
    }

    public i99() {
        this.d = null;
        this.e = new Object[0];
        this.f = false;
        this.h = 0;
        this.n = this;
    }

    public i99(Object obj, Object[] objArr, int i, i99 i99Var) {
        this.d = obj;
        this.e = objArr;
        this.f = true;
        this.h = i;
        this.n = i99Var;
    }
}
