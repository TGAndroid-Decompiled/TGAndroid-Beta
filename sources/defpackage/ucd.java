package defpackage;

import j$.util.Objects;
public final class ucd extends kbd {
    public static final ucd w = new ucd(0, new Object[0]);
    public final transient Object[] r;
    public final transient int s;

    public ucd(int i, Object[] objArr) {
        super((byte) 2);
        this.r = objArr;
        this.s = i;
    }

    @Override
    public final Object get(int i) {
        d9f.a(i, this.s);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int p(Object[] objArr) {
        Object[] objArr2 = this.r;
        int i = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override
    public final int q() {
        return this.s;
    }

    @Override
    public final int s() {
        return 0;
    }

    @Override
    public final int size() {
        return this.s;
    }

    @Override
    public final Object[] v() {
        return this.r;
    }
}
