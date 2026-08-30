package j7;
public final class n9 extends l9 {
    public static final n9 e = new n9(0, new Object[0]);
    public final transient Object[] f9096c;
    public final transient int d;

    public n9(int i10, Object[] objArr) {
        this.f9096c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        j8.a(i10, this.d);
        Object obj = this.f9096c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f9096c;
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
        return this.f9096c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
