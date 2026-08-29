package f7;

import a4.w;
import org.telegram.ui.th;
public final class e {
    public final Object f6657a;
    public final Object f6658b;
    public final Object f6659c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f6657a = obj;
        this.f6658b = obj2;
        this.f6659c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f6657a;
        return new IllegalArgumentException(w.o(String.valueOf(obj), "=", String.valueOf(this.f6659c), th.k("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f6658b), " and ")));
    }
}
