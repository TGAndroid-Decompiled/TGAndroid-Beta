package h7;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;
public final class q {
    public static final l f7030b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String f7031a;

    public q(Context context, cb.l lVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        cb.c.a(context);
        synchronized (u.class) {
            if (u.f7035b == null) {
                u.f7035b = new u(0);
            }
        }
        this.f7031a = "common";
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 2);
        a2.getClass();
        cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        Objects.requireNonNull(lVar);
        p pVar = new p(lVar, 0);
        a10.getClass();
        cb.g.b(pVar);
        l lVar2 = f7030b;
        if (lVar2.containsKey("common")) {
            m6.e.d(context, (String) lVar2.get("common"), false);
        }
    }
}
