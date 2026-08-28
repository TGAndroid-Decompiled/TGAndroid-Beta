package g7;
public final class xa extends ra {
    public final transient Object[] f7407c;
    public final transient int d;
    public final transient int f7408e = 1;

    public xa(int i9, Object[] objArr) {
        this.f7407c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        f7.p7.a(i9, this.f7408e);
        Object obj = this.f7407c[i9 + i9 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f7408e;
    }
}
