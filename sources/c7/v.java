package c7;

import g7.j0;

public final class v extends u {

    public static final v f2497e = new v(0, new Object[0]);

    public final transient Object[] f2498c;
    public final transient int d;

    public v(int i10, Object[] objArr) {
        this.f2498c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        j0.a(i10, this.d);
        Object obj = this.f2498c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f2498c;
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
    public final boolean p() {
        return false;
    }

    @Override
    public final Object[] q() {
        return this.f2498c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
