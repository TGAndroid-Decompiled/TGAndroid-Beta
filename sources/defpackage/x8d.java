package defpackage;
public final class x8d {
    public final Object a;
    public final Object b;
    public final Object c;

    public x8d(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        return new IllegalArgumentException(kt6.p(String.valueOf(obj), "=", String.valueOf(this.c), mlb.m("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.b), " and ")));
    }
}
