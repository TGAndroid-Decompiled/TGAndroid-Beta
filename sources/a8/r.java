package a8;
public final class r extends l {
    public static final r e = new r(0, new Object[0]);
    public final transient Object[] f759c;
    public final transient int d;

    public r(int i10, Object[] objArr) {
        this.f759c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        o0.a(i10, this.d);
        Object obj = this.f759c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f759c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int m() {
        return this.d;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final Object[] o() {
        return this.f759c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
