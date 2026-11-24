package defpackage;

import j$.util.Objects;
public final class s9d extends c9d {
    public static final s9d w = new s9d(0, new Object[0]);
    public final transient Object[] r;
    public final transient int s;

    public s9d(int i, Object[] objArr) {
        super((byte) 3);
        this.r = objArr;
        this.s = i;
    }

    @Override
    public final Object get(int i) {
        w5f.a(i, this.s);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final Object[] r() {
        return this.r;
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
    public final int t() {
        return this.s;
    }

    @Override
    public final int w(Object[] objArr) {
        Object[] objArr2 = this.r;
        int i = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }
}
