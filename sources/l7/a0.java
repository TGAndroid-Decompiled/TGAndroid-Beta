package l7;
public final class a0 extends s {
    public final transient Object[] f11742c;
    public final transient int d;
    public final transient int f11743e = 1;

    public a0(int i10, Object[] objArr) {
        this.f11742c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        k7.k.a(i10, this.f11743e);
        Object obj = this.f11742c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f11743e;
    }
}
