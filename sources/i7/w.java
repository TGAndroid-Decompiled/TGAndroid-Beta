package i7;

public final class w extends s {

    public static final w f10864e = new w(0, new Object[0]);

    public final transient Object[] f10865c;
    public final transient int d;

    public w(int i10, Object[] objArr) {
        this.f10865c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        g7.g8.a(i10, this.d);
        Object obj = this.f10865c[i10];
        obj.getClass();
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f10865c;
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
        return this.f10865c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
