package d7;

import j3.r0;
public final class e {
    public final Object f4425a;
    public final Object f4426b;
    public final Object f4427c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f4425a = obj;
        this.f4426b = obj2;
        this.f4427c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f4425a;
        return new IllegalArgumentException(aa.d.p(String.valueOf(obj), "=", String.valueOf(this.f4427c), r0.q("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f4426b), " and ")));
    }
}
