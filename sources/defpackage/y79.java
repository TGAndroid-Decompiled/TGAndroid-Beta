package defpackage;

import j$.util.Objects;
public final class y79 extends mo5 {
    public static final y79 e = new y79(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public y79(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override
    public final Object get(int i) {
        jte.j(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override
    public final Object[] j() {
        return this.c;
    }

    @Override
    public final int k() {
        return this.d;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
