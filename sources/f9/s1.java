package f9;

import a8.yb;
import j$.util.Objects;
public final class s1 extends i0 {
    public static final s1 e = new s1(0, new Object[0]);
    public final transient Object[] f10342c;
    public final transient int d;

    public s1(int i10, Object[] objArr) {
        this.f10342c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        yb.j(i10, this.d);
        Object obj = this.f10342c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int m(int i10, Object[] objArr) {
        Object[] objArr2 = this.f10342c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] n() {
        return this.f10342c;
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
