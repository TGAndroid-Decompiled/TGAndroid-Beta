package n7;
public final class q extends i {
    public final transient Object[] f14677c;
    public final transient int d;
    public final transient int e = 1;

    public q(int i10, Object[] objArr) {
        this.f14677c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        k7.e0.a(i10, this.e);
        Object obj = this.f14677c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
