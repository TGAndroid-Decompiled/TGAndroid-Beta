package d7;

import h7.z6;
public final class u extends t {
    public static final u f5466e = new u(0, new Object[0]);
    public final transient Object[] f5467c;
    public final transient int d;

    public u(int i10, Object[] objArr) {
        this.f5467c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        z6.a(i10, this.d);
        Object obj = this.f5467c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f5467c;
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
        return this.f5467c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
