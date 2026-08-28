package ja;

import android.content.Context;
import android.os.Bundle;
import g7.o;
import ha.f0;
import ha.s;
public final class h {
    public static final f f14270c = new Object();
    public static final m1.c d = o.a(s.f10366b);
    public final xa.c f14271a;
    public final d f14272b;

    public h(s8.h hVar, qc.h hVar2, qc.h hVar3, y9.d dVar) {
        hVar.a();
        Context context = hVar.f47470a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        f0 f0Var = f0.f10298a;
        ha.b a2 = f0.a(hVar);
        xa.c cVar = new xa.c(context);
        j4.c cVar2 = new j4.c(a2, hVar2);
        f14270c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, cVar2, d.a(context, f.f14266a[0]));
        this.f14271a = cVar;
        this.f14272b = dVar2;
    }

    public final double a() {
        Double d9;
        Bundle bundle = (Bundle) this.f14271a.f49099b;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            d9 = Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        } else {
            d9 = null;
        }
        if (d9 != null) {
            double doubleValue = d9.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        e eVar = this.f14272b.f14261c.f14284b;
        if (eVar != null) {
            Double d10 = eVar.f14263b;
            if (d10 != null) {
                double doubleValue2 = d10.doubleValue();
                if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                    return doubleValue2;
                }
            }
            return 1.0d;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object b(sc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: ja.h.b(sc.c):java.lang.Object");
    }
}
