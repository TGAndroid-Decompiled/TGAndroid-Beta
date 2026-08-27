package i7;

public final class a0 extends s {

    public final transient Object[] f10574c;
    public final transient int d;

    public final transient int f10575e = 1;

    public a0(int i10, Object[] objArr) {
        this.f10574c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        g7.g8.a(i10, this.f10575e);
        Object obj = this.f10574c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f10575e;
    }
}
