package a8;
public final class a0 extends u {
    public static final a0 f308e = new a0(0, new Object[0]);
    public final transient Object[] f309c;
    public final transient int d;

    public a0(int i7, Object[] objArr) {
        this.f309c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f309c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        x0.a(i7, this.d);
        Object obj = this.f309c[i7];
        obj.getClass();
        return obj;
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
        return this.f309c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
