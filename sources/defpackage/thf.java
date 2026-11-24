package defpackage;
public final class thf extends f7f {
    public final transient Object[] h;
    public final transient boolean n;
    public final transient boolean r;

    public thf(int i, Object[] objArr) {
        super((byte) 2);
        this.h = objArr;
        this.n = i;
        this.r = true;
    }

    @Override
    public final Object get(int i) {
        q1f.a(i, this.r ? 1 : 0);
        Object obj = this.h[(i << 1) + (this.n ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.r ? 1 : 0;
    }
}
