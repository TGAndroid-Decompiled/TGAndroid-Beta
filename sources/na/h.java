package na;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.o;
import k7.p;
import l7.w0;
import la.c0;
import la.r;
public final class h {
    public static final f f15897c = new Object();
    public static final m1.c d = p.a(r.f12236b);
    public final o f15898a;
    public final d f15899b;

    public h(w8.g gVar, uc.h hVar, uc.h hVar2, ca.d dVar) {
        gVar.a();
        Context context = gVar.f49452a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        c0 c0Var = c0.f12154a;
        la.b a2 = c0.a(gVar);
        o oVar = new o(context);
        w0 w0Var = new w0(a2, hVar);
        f15897c.getClass();
        d dVar2 = new d(hVar2, dVar, a2, w0Var, d.a(context, f.f15893a[0]));
        this.f15898a = oVar;
        this.f15899b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = this.f15898a.f4075a;
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
        e eVar = this.f15899b.f15888c.f15911b;
        if (eVar != null) {
            Double d11 = eVar.f15890b;
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
