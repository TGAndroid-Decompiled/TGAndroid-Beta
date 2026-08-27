package k7;

public final class q extends i {

    public final transient Object[] f14913c;
    public final transient int d;

    public final transient int f14914e = 1;

    public q(int i10, Object[] objArr) {
        this.f14913c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        g7.f9.b(i10, this.f14914e);
        Object obj = this.f14913c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f14914e;
    }
}
