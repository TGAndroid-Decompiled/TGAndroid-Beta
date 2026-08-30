package kb;

import b6.m;
import jb.c;
public final class b extends c {
    public static final b f10280b;

    static {
        ?? obj = new Object();
        obj.f10279a = -1.0f;
        boolean z4 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z4 = true;
        }
        m.a("Confidence Threshold should be in range [0.0f, 1.0f].", z4);
        obj.f10279a = 0.5f;
        f10280b = new c(obj);
    }
}
