package n7;

import j$.util.Objects;
public final class y extends n {
    public static final y e = new y(0, new Object[0]);
    public final transient Object[] f14009c;
    public final transient int d;

    public y(int i10, Object[] objArr) {
        this.f14009c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        a.e(i10, this.d);
        Object obj = this.f14009c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f14009c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int n() {
        return this.d;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] q() {
        return this.f14009c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
