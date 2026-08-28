package o8;

import j$.util.Objects;
public final class p0 extends z {
    public final transient Object[] f19076c;
    public final transient int d;
    public final transient int f19077e;

    public p0(int i9, int i10, Object[] objArr) {
        this.f19076c = objArr;
        this.d = i9;
        this.f19077e = i10;
    }

    @Override
    public final Object get(int i9) {
        g7.d0.b(i9, this.f19077e);
        Object obj = this.f19076c[(i9 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.f19077e;
    }
}
