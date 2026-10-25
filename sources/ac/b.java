package ac;

import o6.l;
import zb.c;
public final class b extends c {
    public static final b f1237b;

    static {
        ?? obj = new Object();
        obj.f1236a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        l.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        obj.f1236a = 0.5f;
        f1237b = new c(obj);
    }
}
