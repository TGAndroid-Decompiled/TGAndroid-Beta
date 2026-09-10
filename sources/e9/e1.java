package e9;

import j$.util.Objects;
import v7.t6;
public final class e1 extends i0 {
    public final transient Object[] f7371c;
    public final transient int d;
    public final transient int e;

    public e1(int i10, int i11, Object[] objArr) {
        this.f7371c = objArr;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final Object get(int i10) {
        t6.c(i10, this.e);
        Object obj = this.f7371c[(i10 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
