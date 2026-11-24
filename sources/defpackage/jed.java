package defpackage;
public final class jed extends aad {
    public final transient Object[] h;
    public final transient boolean n;
    public final transient boolean r;

    public jed(int i, Object[] objArr) {
        super((byte) 0);
        this.h = objArr;
        this.n = i;
        this.r = true;
    }

    @Override
    public final Object get(int i) {
        l2f.a(i, this.r ? 1 : 0);
        Object obj = this.h[(i << 1) + (this.n ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.r ? 1 : 0;
    }
}
