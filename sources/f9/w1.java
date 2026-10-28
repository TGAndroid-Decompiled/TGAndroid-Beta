package f9;

import a8.yb;
import j$.util.Objects;
public final class w1 extends i0 {
    public final transient Object[] f10355c;
    public final transient int d;
    public final transient int e;

    public w1(int i10, int i11, Object[] objArr) {
        this.f10355c = objArr;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final Object get(int i10) {
        yb.j(i10, this.e);
        Object obj = this.f10355c[(i10 * 2) + this.d];
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
