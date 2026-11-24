package defpackage;
public final class s5d extends jff {
    public final transient Object[] h;
    public final transient boolean n;
    public final transient boolean r;

    public s5d(int i, Object[] objArr) {
        super((byte) 3);
        this.h = objArr;
        this.n = i;
        this.r = true;
    }

    @Override
    public final Object get(int i) {
        r2f.a(i, this.r ? 1 : 0);
        Object obj = this.h[(i << 1) + (this.n ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.r ? 1 : 0;
    }
}
