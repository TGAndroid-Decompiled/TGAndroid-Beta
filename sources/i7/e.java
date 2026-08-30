package i7;

import j$.util.Objects;
import j7.c8;
public final class e extends d {
    public static final e e = new e(0, new Object[0]);
    public final transient Object[] f7361c;
    public final transient int d;

    public e(int i10, Object[] objArr) {
        this.f7361c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        c8.a(i10, this.d);
        Object obj = this.f7361c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f7361c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int n() {
        return this.d;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] p() {
        return this.f7361c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
