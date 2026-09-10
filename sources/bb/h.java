package bb;

import android.content.Context;
import android.os.Bundle;
import w7.r;
import za.c0;
public final class h {
    public static final f f2166c = new Object();
    public static final m1.c d = r.a(za.r.f47946b);
    public final xa.c f2167a;
    public final d f2168b;

    public h(k9.h hVar, id.h hVar2, id.h hVar3, qa.d dVar) {
        hVar.a();
        Context context = hVar.f12392a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        c0 c0Var = c0.f47872a;
        za.b a2 = c0.a(hVar);
        xa.c cVar = new xa.c(context);
        aa.a aVar = new aa.a(a2, hVar2);
        f2166c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, aVar, d.a(context, f.f2162a[0]));
        this.f2167a = cVar;
        this.f2168b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = (Bundle) this.f2167a.f45077b;
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
        e eVar = this.f2168b.f2158c.f2182b;
        if (eVar != null) {
            Double d11 = eVar.f2160b;
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

    public final java.lang.Object b(kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: bb.h.b(kd.c):java.lang.Object");
    }
}
