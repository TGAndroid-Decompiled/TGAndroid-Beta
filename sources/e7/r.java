package e7;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;

public final class r {

    public static final l f5340b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);

    public final String f5341a;

    public r(Context context, za.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        za.c.a(context);
        synchronized (v.class) {
            if (v.f5345b == null) {
                v.f5345b = new v(0);
            }
        }
        this.f5341a = "common";
        za.f fVarA = za.f.a();
        int i10 = 0;
        p pVar = new p(this, i10);
        fVarA.getClass();
        za.f.b(pVar);
        za.f fVarA2 = za.f.a();
        Objects.requireNonNull(kVar);
        q qVar = new q(kVar, i10);
        fVarA2.getClass();
        za.f.b(qVar);
        l lVar = f5340b;
        if (lVar.containsKey("common")) {
            j6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
