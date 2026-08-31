package h7;

import org.telegram.ui.yh;
public final class e {
    public final Object f7325a;
    public final Object f7326b;
    public final Object f7327c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f7325a = obj;
        this.f7326b = obj2;
        this.f7327c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f7325a;
        return new IllegalArgumentException(android.support.v4.media.a.p(String.valueOf(obj), "=", String.valueOf(this.f7327c), yh.m("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f7326b), " and ")));
    }
}
