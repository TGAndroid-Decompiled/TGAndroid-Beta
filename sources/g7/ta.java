package g7;
public final class ta extends ra {
    public static final ta f7374e = new ta(0, new Object[0]);
    public final transient Object[] f7375c;
    public final transient int d;

    public ta(int i9, Object[] objArr) {
        this.f7375c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        f7.p7.a(i9, this.d);
        Object obj = this.f7375c[i9];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f7375c;
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
        return this.f7375c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
