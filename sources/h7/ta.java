package h7;

public final class ta extends ra {

    public static final ta f8548e = new ta(0, new Object[0]);

    public final transient Object[] f8549c;
    public final transient int d;

    public ta(int i10, Object[] objArr) {
        this.f8549c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        g7.r7.a(i10, this.d);
        Object obj = this.f8549c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f8549c;
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
        return this.f8549c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
