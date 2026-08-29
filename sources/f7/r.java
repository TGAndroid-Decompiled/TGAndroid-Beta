package f7;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;
public final class r {
    public static final l f6677b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String f6678a;

    public r(Context context, ab.l lVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        ab.c.a(context);
        synchronized (v.class) {
            if (v.f6682b == null) {
                v.f6682b = new v(0);
            }
        }
        this.f6678a = "common";
        ab.g a2 = ab.g.a();
        p pVar = new p(this, 0);
        a2.getClass();
        ab.g.b(pVar);
        ab.g a10 = ab.g.a();
        Objects.requireNonNull(lVar);
        q qVar = new q(lVar, 0);
        a10.getClass();
        ab.g.b(qVar);
        l lVar2 = f6677b;
        if (lVar2.containsKey("common")) {
            k6.e.d(context, (String) lVar2.get("common"), false);
        }
    }
}
