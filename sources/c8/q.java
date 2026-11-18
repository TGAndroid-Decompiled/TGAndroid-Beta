package c8;
public final class q extends i {
    public final transient Object[] f4919c;
    public final transient int d;
    public final transient int f4920e = 1;

    public q(int i7, Object[] objArr) {
        this.f4919c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        a8.g8.a(i7, this.f4920e);
        Object obj = this.f4919c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f4920e;
    }
}
