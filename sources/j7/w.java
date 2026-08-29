package j7;
public final class w extends s {
    public static final w f11236e = new w(0, new Object[0]);
    public final transient Object[] f11237c;
    public final transient int d;

    public w(int i10, Object[] objArr) {
        this.f11237c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        h7.u8.a(i10, this.d);
        Object obj = this.f11237c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f11237c;
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
        return this.f11237c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
