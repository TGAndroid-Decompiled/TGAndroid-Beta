package c8;
public final class q extends i {
    public final transient Object[] f5807c;
    public final transient int d;
    public final transient int f5808e = 1;

    public q(int i7, Object[] objArr) {
        this.f5807c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        a8.f8.a(i7, this.f5808e);
        Object obj = this.f5807c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f5808e;
    }
}
