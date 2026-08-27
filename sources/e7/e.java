package e7;

public final class e {

    public final Object f5320a;

    public final Object f5321b;

    public final Object f5322c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f5320a = obj;
        this.f5321b = obj2;
        this.f5322c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f5320a;
        return new IllegalArgumentException(a9.p.n(String.valueOf(obj), "=", String.valueOf(this.f5322c), i0.a.p("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f5321b), " and ")));
    }
}
