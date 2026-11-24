package defpackage;
public final class ihd extends ped {
    public static final ihd r = new ihd(0, new Object[0]);
    public final transient Object[] h;
    public final transient int n;

    public ihd(int i, Object[] objArr) {
        super((byte) 1);
        this.h = objArr;
        this.n = i;
    }

    @Override
    public final Object get(int i) {
        k6f.a(i, this.n);
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
