package n7;
public final class m extends i {
    public static final m e = new m(0, new Object[0]);
    public final transient Object[] f14654c;
    public final transient int d;

    public m(int i10, Object[] objArr) {
        this.f14654c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        k7.e0.a(i10, this.d);
        Object obj = this.f14654c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f14654c;
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
        return this.f14654c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
