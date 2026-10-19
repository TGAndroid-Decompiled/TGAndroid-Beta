package cb;

import ab.f0;
import android.content.Context;
import android.os.Bundle;
import w7.s;
public final class h {
    public static final f f5069c = new Object();
    public static final m1.c d = s.a(ab.s.f460b);
    public final qb.c f5070a;
    public final d f5071b;

    public h(l9.h hVar, kd.h hVar2, kd.h hVar3, ra.d dVar) {
        hVar.a();
        Context context = hVar.f15969a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        f0 f0Var = f0.f397a;
        ab.b a2 = f0.a(hVar);
        qb.c cVar = new qb.c(context);
        androidx.biometric.e eVar = new androidx.biometric.e(a2, hVar2);
        f5069c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, eVar, d.a(context, f.f5065a[0]));
        this.f5070a = cVar;
        this.f5071b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = (Bundle) this.f5070a.f44425b;
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
        e eVar = this.f5071b.f5061c.f5082b;
        if (eVar != null) {
            Double d11 = eVar.f5063b;
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

    public final java.lang.Object b(md.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: cb.h.b(md.c):java.lang.Object");
    }
}
