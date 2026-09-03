package h7;

import org.telegram.ui.ai;
public final class e {
    public final Object f7003a;
    public final Object f7004b;
    public final Object f7005c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f7003a = obj;
        this.f7004b = obj2;
        this.f7005c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f7003a;
        return new IllegalArgumentException(android.support.v4.media.a.p(String.valueOf(obj), "=", String.valueOf(this.f7005c), ai.l("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f7004b), " and ")));
    }
}
