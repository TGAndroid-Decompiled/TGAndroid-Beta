package defpackage;
public final class rkd extends ghd {
    public final transient Object[] h;
    public final transient boolean n;
    public final transient boolean r;

    public rkd(int i, Object[] objArr) {
        super((byte) 1);
        this.h = objArr;
        this.n = i;
        this.r = true;
    }

    @Override
    public final Object get(int i) {
        b9f.a(i, this.r ? 1 : 0);
        Object obj = this.h[(i << 1) + (this.n ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.r ? 1 : 0;
    }
}
