package gb;

import fb.c;
import x5.l;
public final class b extends c {
    public static final b f7690b;

    static {
        ?? obj = new Object();
        obj.f7689a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        l.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        obj.f7689a = 0.5f;
        f7690b = new c(obj);
    }
}
