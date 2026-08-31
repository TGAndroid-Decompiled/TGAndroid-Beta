package l7;
public final class w extends s {
    public static final w f12077e = new w(0, new Object[0]);
    public final transient Object[] f12078c;
    public final transient int d;

    public w(int i10, Object[] objArr) {
        this.f12078c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        k7.k.a(i10, this.d);
        Object obj = this.f12078c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f12078c;
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
        return this.f12078c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
