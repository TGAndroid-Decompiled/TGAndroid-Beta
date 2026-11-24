package defpackage;
public final class i5e extends u3e {
    public static final i5e w = new i5e(0, new Object[0]);
    public final transient Object[] r;
    public final transient int s;

    public i5e(int i, Object[] objArr) {
        super((byte) 5);
        this.r = objArr;
        this.s = i;
    }

    @Override
    public final Object get(int i) {
        p1f.a(i, this.s);
        Object obj = this.r[i];
        obj.getClass();
        return obj;
    }

    @Override
    public final int p(Object[] objArr) {
        Object[] objArr2 = this.r;
        int i = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override
    public final int q() {
        return this.s;
    }

    @Override
    public final int s() {
        return 0;
    }

    @Override
    public final int size() {
        return this.s;
    }

    @Override
    public final Object[] x() {
        return this.r;
    }
}
