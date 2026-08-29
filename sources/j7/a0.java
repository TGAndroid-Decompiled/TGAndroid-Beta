package j7;
public final class a0 extends s {
    public final transient Object[] f10901c;
    public final transient int d;
    public final transient int f10902e = 1;

    public a0(int i10, Object[] objArr) {
        this.f10901c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        h7.u8.a(i10, this.f10902e);
        Object obj = this.f10901c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f10902e;
    }
}
