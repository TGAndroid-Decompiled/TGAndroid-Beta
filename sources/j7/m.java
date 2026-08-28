package j7;
public final class m extends i {
    public static final m f14019e = new m(0, new Object[0]);
    public final transient Object[] f14020c;
    public final transient int d;

    public m(int i9, Object[] objArr) {
        this.f14020c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        f7.y8.a(i9, this.d);
        Object obj = this.f14020c[i9];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f14020c;
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
    public final Object[] p() {
        return this.f14020c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
