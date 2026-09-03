package k7;
public final class ta extends ra {
    public static final ta e = new ta(0, new Object[0]);
    public final transient Object[] f9977c;
    public final transient int d;

    public ta(int i10, Object[] objArr) {
        this.f9977c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        j7.t8.a(i10, this.d);
        Object obj = this.f9977c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f9977c;
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
        return this.f9977c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
