package defpackage;
public final class v6d {
    public final Object a;
    public final Object b;
    public final Object c;

    public v6d(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        return new IllegalArgumentException(ls6.o(String.valueOf(obj), "=", String.valueOf(this.c), yjb.l("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.b), " and ")));
    }
}
