package h7;
public final class w extends s {
    public static final w f10155e = new w(0, new Object[0]);
    public final transient Object[] f10156c;
    public final transient int d;

    public w(int i9, Object[] objArr) {
        this.f10156c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        f7.b8.a(i9, this.d);
        Object obj = this.f10156c[i9];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f10156c;
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
        return this.f10156c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
