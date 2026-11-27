package defpackage;
public final class obd {
    public final Object a;
    public final Object b;
    public final Object c;

    public obd(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        return new IllegalArgumentException(qu6.o(String.valueOf(obj), "=", String.valueOf(this.c), xnb.l("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.b), " and ")));
    }
}
