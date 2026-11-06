package a8;
public final class e0 extends u {
    public final transient Object[] f373c;
    public final transient int d;
    public final transient int f374e = 1;

    public e0(int i7, Object[] objArr) {
        this.f373c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        x0.a(i7, this.f374e);
        Object obj = this.f373c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f374e;
    }
}
