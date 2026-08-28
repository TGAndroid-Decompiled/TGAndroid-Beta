package o8;

import j$.util.Objects;
public final class l0 extends z {
    public static final l0 f19056e = new l0(0, new Object[0]);
    public final transient Object[] f19057c;
    public final transient int d;

    public l0(int i9, Object[] objArr) {
        this.f19057c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        g7.d0.b(i9, this.d);
        Object obj = this.f19057c[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int n(int i9, Object[] objArr) {
        Object[] objArr2 = this.f19057c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, i9, i10);
        return i9 + i10;
    }

    @Override
    public final Object[] o() {
        return this.f19057c;
    }

    @Override
    public final int p() {
        return this.d;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
