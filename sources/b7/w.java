package b7;

import f7.i0;
public final class w extends v {
    public static final w f1591e = new w(0, new Object[0]);
    public final transient Object[] f1592c;
    public final transient int d;

    public w(int i9, Object[] objArr) {
        this.f1592c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        i0.a(i9, this.d);
        Object obj = this.f1592c[i9];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f1592c;
        int i9 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
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
        return this.f1592c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
