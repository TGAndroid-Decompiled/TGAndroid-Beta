package d7;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;
public final class r {
    public static final l f4445b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String f4446a;

    public r(Context context, ya.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        ya.c.a(context);
        synchronized (u.class) {
            if (u.f4449b == null) {
                u.f4449b = new u(0);
            }
        }
        this.f4446a = "common";
        ya.f a2 = ya.f.a();
        p pVar = new p(this, 0);
        a2.getClass();
        ya.f.b(pVar);
        ya.f a3 = ya.f.a();
        Objects.requireNonNull(kVar);
        q qVar = new q(kVar, 0);
        a3.getClass();
        ya.f.b(qVar);
        l lVar = f4445b;
        if (lVar.containsKey("common")) {
            i6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
