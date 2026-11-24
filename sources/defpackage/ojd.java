package defpackage;

import j$.util.Objects;
public final class ojd extends fhd {
    public static final ojd e = new ojd(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public ojd(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override
    public final Object get(int i) {
        u1f.a(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override
    public final int i() {
        return this.d;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final Object[] m() {
        return this.c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
