package cb;

import ab.f0;
import ab.s;
import android.content.Context;
import android.os.Bundle;
import w7.t;
public final class h {
    public static final f f4696c = new Object();
    public static final m1.c d = t.a(s.f458b);
    public final android.support.v4.media.c f4697a;
    public final d f4698b;

    public h(l9.h hVar, kd.h hVar2, kd.h hVar3, ra.d dVar) {
        hVar.a();
        Context context = hVar.f14626a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        f0 f0Var = f0.f395a;
        ab.b a2 = f0.a(hVar);
        android.support.v4.media.c cVar = new android.support.v4.media.c(context);
        androidx.biometric.e eVar = new androidx.biometric.e(a2, hVar2);
        f4696c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, eVar, d.a(context, f.f4692a[0]));
        this.f4697a = cVar;
        this.f4698b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = this.f4697a.f952a;
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
        e eVar = this.f4698b.f4688c.f4709b;
        if (eVar != null) {
            Double d11 = eVar.f4690b;
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
