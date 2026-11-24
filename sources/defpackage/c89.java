package defpackage;

import j$.util.Objects;
public final class c89 extends mo5 {
    public final transient Object[] c;
    public final transient boolean d;
    public final transient int e;

    public c89(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override
    public final Object get(int i) {
        jte.j(i, this.e);
        Object obj = this.c[(i << 1) + (this.d ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
