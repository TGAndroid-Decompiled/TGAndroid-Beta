package h9;

import a8.ma;
import j$.util.Objects;
public final class x1 extends i0 {
    public final transient Object[] f14083c;
    public final transient int d;
    public final transient int f14084e;

    public x1(int i7, int i10, Object[] objArr) {
        this.f14083c = objArr;
        this.d = i7;
        this.f14084e = i10;
    }

    @Override
    public final Object get(int i7) {
        ma.j(i7, this.f14084e);
        Object obj = this.f14083c[(i7 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final int size() {
        return this.f14084e;
    }
}
