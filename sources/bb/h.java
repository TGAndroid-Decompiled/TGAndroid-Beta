package bb;

import android.content.Context;
import android.os.Bundle;
import w7.p;
import za.d0;
import za.s;
public final class h {
    public static final f f3825c = new Object();
    public static final m1.c d = p.a(s.f54285b);
    public final pb.c f3826a;
    public final d f3827b;

    public h(k9.h hVar, jd.h hVar2, jd.h hVar3, qa.d dVar) {
        hVar.a();
        Context context = hVar.f14747a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        d0 d0Var = d0.f54208a;
        za.b a2 = d0.a(hVar);
        pb.c cVar = new pb.c(context);
        aa.a aVar = new aa.a(a2, hVar2);
        f3825c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, aVar, d.a(context, f.f3821a[0]));
        this.f3826a = cVar;
        this.f3827b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = (Bundle) this.f3826a.f45542b;
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
        e eVar = this.f3827b.f3816c.f3842b;
        if (eVar != null) {
            Double d11 = eVar.f3818b;
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
        throw new UnsupportedOperationException("Method not decompiled: bb.h.b(ld.c):java.lang.Object");
    }
}
