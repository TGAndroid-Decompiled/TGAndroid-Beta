package e9;

import j$.util.Objects;
import v7.u6;
public final class b2 extends n0 {
    public final transient Object[] f8540c;
    public final transient int d;
    public final transient int e;

    public b2(int i10, int i11, Object[] objArr) {
        this.f8540c = objArr;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final Object get(int i10) {
        u6.j(i10, this.e);
        Object obj = this.f8540c[(i10 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
