package a8;
public final class v extends l {
    public final transient Object[] f957c;
    public final transient int d;
    public final transient int e = 1;

    public v(int i10, Object[] objArr) {
        this.f957c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        o0.a(i10, this.e);
        Object obj = this.f957c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
