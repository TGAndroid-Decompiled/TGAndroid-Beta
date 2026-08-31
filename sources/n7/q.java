package n7;
public final class q extends i {
    public final transient Object[] f15688c;
    public final transient int d;
    public final transient int f15689e = 1;

    public q(int i10, Object[] objArr) {
        this.f15688c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        k7.f0.a(i10, this.f15689e);
        Object obj = this.f15688c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f15689e;
    }
}
