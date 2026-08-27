package h7;

public final class xa extends ra {

    public final transient Object[] f8580c;
    public final transient int d;

    public final transient int f8581e = 1;

    public xa(int i10, Object[] objArr) {
        this.f8580c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        g7.r7.a(i10, this.f8581e);
        Object obj = this.f8580c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f8581e;
    }
}
