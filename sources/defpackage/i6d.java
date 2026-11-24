package defpackage;

import j$.util.Objects;
public final class i6d extends g6d {
    public static final i6d w = new i6d(0, new Object[0]);
    public final transient Object[] r;
    public final transient boolean s;

    public i6d(int i, Object[] objArr) {
        super((byte) 1);
        this.r = objArr;
        this.s = i;
    }

    @Override
    public final Object get(int i) {
        a1f.a(i, this.s ? 1 : 0);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int l(Object[] objArr) {
        Object[] objArr2 = this.r;
        boolean z = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, z ? 1 : 0);
        return z ? 1 : 0;
    }

    @Override
    public final int m() {
        return this.s ? 1 : 0;
    }

    @Override
    public final Object[] o() {
        return this.r;
    }

    @Override
    public final int size() {
        return this.s ? 1 : 0;
    }
}
