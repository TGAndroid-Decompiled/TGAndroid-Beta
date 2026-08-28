package h7;
public final class a0 extends s {
    public final transient Object[] f9865c;
    public final transient int d;
    public final transient int f9866e = 1;

    public a0(int i9, Object[] objArr) {
        this.f9865c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        f7.b8.a(i9, this.f9866e);
        Object obj = this.f9865c[i9 + i9 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f9866e;
    }
}
