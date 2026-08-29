package l7;
public final class q extends i {
    public final transient Object[] f14918c;
    public final transient int d;
    public final transient int f14919e = 1;

    public q(int i10, Object[] objArr) {
        this.f14918c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        i7.r.a(i10, this.f14919e);
        Object obj = this.f14918c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f14919e;
    }
}
