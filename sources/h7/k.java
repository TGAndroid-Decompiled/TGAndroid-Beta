package h7;

import j$.util.Objects;
import j7.u7;
public final class k extends d {
    public final transient Object[] f7335c;
    public final transient int d;
    public final transient int f7336e;

    public k(int i10, int i11, Object[] objArr) {
        this.f7335c = objArr;
        this.d = i10;
        this.f7336e = i11;
    }

    @Override
    public final Object get(int i10) {
        u7.a(i10, this.f7336e);
        Object obj = this.f7335c[i10 + i10 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f7336e;
    }
}
