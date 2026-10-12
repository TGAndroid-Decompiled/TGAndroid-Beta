package bb;

import android.content.Context;
import android.os.Bundle;
import w7.o;
import za.c0;
import za.s;
public final class i {
    public static final g f3824c = new Object();
    public static final m1.c d = o.a(s.f54516b);
    public final a f3825a;
    public final e f3826b;

    public i(k9.h hVar, jd.h hVar2, jd.h hVar3, qa.d dVar) {
        hVar.a();
        Context context = hVar.f14744a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        c0 c0Var = c0.f54433a;
        za.b a2 = c0.a(hVar);
        a aVar = new a(context);
        aa.a aVar2 = new aa.a(a2, hVar2);
        f3824c.getClass();
        e eVar = new e(hVar3, dVar, a2, aVar2, d.a(context, g.f3820a[0]));
        this.f3825a = aVar;
        this.f3826b = eVar;
    }

    public final double a() {
        Double d10;
        Bundle bundle = this.f3825a.f3802a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            d10 = Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        } else {
            d10 = null;
        }
        if (d10 != null) {
            double doubleValue = d10.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        f fVar = this.f3826b.f3815c.f3841b;
        if (fVar != null) {
            Double d11 = fVar.f3817b;
            if (d11 != null) {
                double doubleValue2 = d11.doubleValue();
                if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                    return doubleValue2;
                }
            }
            return 1.0d;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object b(ld.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: bb.i.b(ld.c):java.lang.Object");
    }
}
