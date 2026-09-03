package n7;
public final class q extends i {
    public final transient Object[] f15690c;
    public final transient int d;
    public final transient int f15691e = 1;

    public q(int i10, Object[] objArr) {
        this.f15690c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        k7.f0.a(i10, this.f15691e);
        Object obj = this.f15690c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f15691e;
    }
}
