package o7;

import j$.util.Objects;
public final class x extends m {
    public static final x e = new x(0, new Object[0]);
    public final transient Object[] f19264c;
    public final transient int d;

    public x(int i10, Object[] objArr) {
        this.f19264c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        a.e(i10, this.d);
        Object obj = this.f19264c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f19264c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int m() {
        return this.d;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final Object[] p() {
        return this.f19264c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
