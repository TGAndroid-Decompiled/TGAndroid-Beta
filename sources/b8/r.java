package b8;
public final class r extends l {
    public static final r f3033e = new r(0, new Object[0]);
    public final transient Object[] f3034c;
    public final transient int d;

    public r(int i3, Object[] objArr) {
        this.f3034c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        n1.a(i3, this.d);
        Object obj = this.f3034c[i3];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f3034c;
        int i3 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override
    public final int i() {
        return this.d;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final Object[] k() {
        return this.f3034c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
