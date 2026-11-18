package h9;

import a8.la;
import j$.util.Objects;
public final class t1 extends i0 {
    public static final t1 f14071e = new t1(0, new Object[0]);
    public final transient Object[] f14072c;
    public final transient int d;

    public t1(int i7, Object[] objArr) {
        this.f14072c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        la.j(i7, this.d);
        Object obj = this.f14072c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(int i7, Object[] objArr) {
        Object[] objArr2 = this.f14072c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, i7, i10);
        return i7 + i10;
    }

    @Override
    public final Object[] j() {
        return this.f14072c;
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
