package e7;

import g7.s6;
import j$.util.Objects;

public final class k extends d {

    public final transient Object[] f5330c;
    public final transient int d;

    public final transient int f5331e;

    public k(int i10, int i11, Object[] objArr) {
        this.f5330c = objArr;
        this.d = i10;
        this.f5331e = i11;
    }

    @Override
    public final Object get(int i10) {
        s6.a(i10, this.f5331e);
        Object obj = this.f5330c[i10 + i10 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f5331e;
    }
}
