package f7;
public final class c extends l9 {
    public final transient Object[] f5617c;
    public final transient int d;
    public final transient int f5618e = 1;

    public c(int i9, Object[] objArr) {
        this.f5617c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        a7.a(i9, this.f5618e);
        Object obj = this.f5617c[i9 + i9 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f5618e;
    }
}
