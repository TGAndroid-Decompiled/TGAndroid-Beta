package defpackage;

import j$.util.Objects;
public final class p1d extends o1d {
    public static final p1d s = new p1d(new Object[0]);
    public final transient Object[] r;

    public p1d(Object[] objArr) {
        super((byte) 0);
        this.r = objArr;
    }

    @Override
    public final Object get(int i) {
        s0f.a(i, 0);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        System.arraycopy(this.r, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final Object[] k() {
        return this.r;
    }

    @Override
    public final int size() {
        return 0;
    }
}
