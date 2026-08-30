package h7;

import org.telegram.ui.yh;
public final class e {
    public final Object f7016a;
    public final Object f7017b;
    public final Object f7018c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f7016a = obj;
        this.f7017b = obj2;
        this.f7018c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f7016a;
        return new IllegalArgumentException(android.support.v4.media.a.p(String.valueOf(obj), "=", String.valueOf(this.f7018c), yh.m("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f7017b), " and ")));
    }
}
