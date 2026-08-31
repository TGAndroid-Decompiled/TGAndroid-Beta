package kb;

import b6.m;
import jb.c;
public final class b extends c {
    public static final b f11045b;

    static {
        ?? obj = new Object();
        obj.f11044a = -1.0f;
        boolean z4 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z4 = true;
        }
        m.a("Confidence Threshold should be in range [0.0f, 1.0f].", z4);
        obj.f11044a = 0.5f;
        f11045b = new c(obj);
    }
}
