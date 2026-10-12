package e9;

import j$.util.Objects;
import v7.t6;
public final class a1 extends i0 {
    public static final a1 f8712e = new a1(0, new Object[0]);
    public final transient Object[] f8713c;
    public final transient int d;

    public a1(int i10, Object[] objArr) {
        this.f8713c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        t6.c(i10, this.d);
        Object obj = this.f8713c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.f8713c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] o() {
        return this.f8713c;
    }

    @Override
    public final int p() {
        return this.d;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
