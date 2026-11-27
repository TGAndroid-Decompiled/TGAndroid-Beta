package defpackage;

import j$.util.Objects;
public final class ldd extends kbd {
    public final transient Object[] r;
    public final transient boolean s;
    public final transient int w;

    public ldd(int i, int i2, Object[] objArr) {
        super((byte) 2);
        this.r = objArr;
        this.s = i;
        this.w = i2;
    }

    @Override
    public final Object get(int i) {
        d9f.a(i, this.w);
        Object obj = this.r[(i << 1) + (this.s ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.w;
    }
}
