package c8;
public final class m extends i {
    public static final m f4869e = new m(0, new Object[0]);
    public final transient Object[] f4870c;
    public final transient int d;

    public m(int i7, Object[] objArr) {
        this.f4870c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f4870c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        a8.h8.a(i7, this.d);
        Object obj = this.f4870c[i7];
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
        return this.f4870c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
