package ib;

import hb.c;
import z5.l;
public final class b extends c {
    public static final b f8825b;

    static {
        ?? obj = new Object();
        obj.f8824a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        l.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        obj.f8824a = 0.5f;
        f8825b = new c(obj);
    }
}
