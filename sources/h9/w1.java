package h9;

import a8.ja;
import j$.util.Objects;
public final class w1 extends i0 {
    public final transient Object[] f13767c;
    public final transient int d;
    public final transient int f13768e;

    public w1(int i7, int i10, Object[] objArr) {
        this.f13767c = objArr;
        this.d = i7;
        this.f13768e = i10;
    }

    @Override
    public final Object get(int i7) {
        ja.j(i7, this.f13768e);
        Object obj = this.f13767c[(i7 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final int size() {
        return this.f13768e;
    }
}
