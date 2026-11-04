package b8;
public final class v extends l {
    public final transient Object[] f3089c;
    public final transient int d;
    public final transient int f3090e = 1;

    public v(int i3, Object[] objArr) {
        this.f3089c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        n1.a(i3, this.f3090e);
        Object obj = this.f3089c[i3 + i3 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f3090e;
    }
}
