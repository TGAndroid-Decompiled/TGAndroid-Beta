package defpackage;

import j$.util.Objects;
public final class b8d extends r6d {
    public static final b8d w = new b8d(0, new Object[0]);
    public final transient Object[] r;
    public final transient int s;

    public b8d(int i, Object[] objArr) {
        super((byte) 2);
        this.r = objArr;
        this.s = i;
    }

    @Override
    public final Object get(int i) {
        k4f.a(i, this.s);
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
