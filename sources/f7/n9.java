package f7;
public final class n9 extends l9 {
    public static final n9 f5762e = new n9(0, new Object[0]);
    public final transient Object[] f5763c;
    public final transient int d;

    public n9(int i9, Object[] objArr) {
        this.f5763c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        a7.a(i9, this.d);
        Object obj = this.f5763c[i9];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f5763c;
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
        return this.f5763c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
