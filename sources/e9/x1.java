package e9;

import j$.util.Objects;
import v7.u6;
public final class x1 extends n0 {
    public static final x1 e = new x1(0, new Object[0]);
    public final transient Object[] f8541c;
    public final transient int d;

    public x1(int i10, Object[] objArr) {
        this.f8541c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        u6.j(i10, this.d);
        Object obj = this.f8541c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int m(int i10, Object[] objArr) {
        Object[] objArr2 = this.f8541c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] n() {
        return this.f8541c;
    }

    @Override
    public final int o() {
        return this.d;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
