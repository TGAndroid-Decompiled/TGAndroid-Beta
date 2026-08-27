package hb;

import gb.c;
import y5.l;

public final class b extends c {

    public static final b f8861b;

    static {
        a aVar = new a();
        aVar.f8860a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        l.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        aVar.f8860a = 0.5f;
        f8861b = new b(aVar);
    }
}
