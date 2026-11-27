package defpackage;
public final class kbe extends k8e {
    public final transient Object[] r;
    public final transient boolean s;
    public final transient int w;

    public kbe(int i, int i2, Object[] objArr) {
        super((byte) 5);
        this.r = objArr;
        this.s = i;
        this.w = i2;
    }

    @Override
    public final Object get(int i) {
        h6f.a(i, this.w);
        Object obj = this.r[(i << 1) + (this.s ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.w;
    }
}
