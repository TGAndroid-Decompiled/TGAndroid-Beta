package g9;

import b8.zb;
import j$.util.Objects;
public final class w1 extends i0 {
    public final transient Object[] f12164c;
    public final transient int d;
    public final transient int f12165e;

    public w1(int i3, int i10, Object[] objArr) {
        this.f12164c = objArr;
        this.d = i3;
        this.f12165e = i10;
    }

    @Override
    public final Object get(int i3) {
        zb.j(i3, this.f12165e);
        Object obj = this.f12164c[(i3 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final int size() {
        return this.f12165e;
    }
}
