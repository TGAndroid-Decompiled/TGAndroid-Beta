package defpackage;
public final class imf extends zjf {
    public static final imf r = new imf(0, new Object[0]);
    public final transient Object[] h;
    public final transient int n;

    public imf(int i, Object[] objArr) {
        super((byte) 3);
        this.h = objArr;
        this.n = i;
    }

    @Override
    public final Object get(int i) {
        j7f.a(i, this.n);
        Object obj = this.h[i];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override
    public final int i() {
        return this.n;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final Object[] k() {
        return this.h;
    }

    @Override
    public final int size() {
        return this.n;
    }
}
