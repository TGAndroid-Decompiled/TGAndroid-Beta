package g7;

public final class m9 extends k9 {

    public static final m9 f6562e = new m9(0, new Object[0]);

    public final transient Object[] f6563c;
    public final transient int d;

    public m9(int i10, Object[] objArr) {
        this.f6563c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        c7.a(i10, this.d);
        Object obj = this.f6563c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f6563c;
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
        return this.f6563c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
