package h9;

import a8.ia;
import j$.util.Objects;
public final class x1 extends i0 {
    public final transient Object[] f14414c;
    public final transient int d;
    public final transient int f14415e;

    public x1(int i7, int i10, Object[] objArr) {
        this.f14414c = objArr;
        this.d = i7;
        this.f14415e = i10;
    }

    @Override
    public final Object get(int i7) {
        ia.j(i7, this.f14415e);
        Object obj = this.f14414c[(i7 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final int size() {
        return this.f14415e;
    }
}
