package na;

import android.content.Context;
import android.os.Bundle;
import k7.o;
import l7.w0;
import la.c0;
import la.r;
public final class h {
    public static final f f14868c = new Object();
    public static final m1.c d = o.a(r.f11929b);
    public final android.support.v4.media.d f14869a;
    public final d f14870b;

    public h(w8.g gVar, uc.h hVar, uc.h hVar2, ca.d dVar) {
        gVar.a();
        Context context = gVar.f46560a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        c0 c0Var = c0.f11855a;
        la.b a2 = c0.a(gVar);
        android.support.v4.media.d dVar2 = new android.support.v4.media.d(context);
        w0 w0Var = new w0(a2, hVar);
        f14868c.getClass();
        d dVar3 = new d(hVar2, dVar, a2, w0Var, d.a(context, f.f14864a[0]));
        this.f14869a = dVar2;
        this.f14870b = dVar3;
    }

    public final double a() {
        Double d10;
        Bundle bundle = this.f14869a.f235a;
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
        e eVar = this.f14870b.f14860c.f14881b;
        if (eVar != null) {
            Double d11 = eVar.f14862b;
            if (d11 != null) {
                double doubleValue2 = d11.doubleValue();
                if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                    return doubleValue2;
                }
            }
            return 1.0d;
        }
        kotlin.jvm.internal.j.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object b(wc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: na.h.b(wc.c):java.lang.Object");
    }
}
