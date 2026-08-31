package k7;
public final class xa extends ra {
    public final transient Object[] f10762c;
    public final transient int d;
    public final transient int f10763e = 1;

    public xa(int i10, Object[] objArr) {
        this.f10762c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        j7.u8.a(i10, this.f10763e);
        Object obj = this.f10762c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f10763e;
    }
}
