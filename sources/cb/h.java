package cb;

import a6.m;
import ab.f0;
import android.content.Context;
import android.os.Bundle;
import w7.s;
public final class h {
    public static final f f5070c = new Object();
    public static final m1.c d = s.a(ab.s.f461b);
    public final m f5071a;
    public final d f5072b;

    public h(l9.h hVar, kd.h hVar2, kd.h hVar3, ra.d dVar) {
        hVar.a();
        Context context = hVar.f15968a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        f0 f0Var = f0.f398a;
        ab.b a2 = f0.a(hVar);
        m mVar = new m(context);
        androidx.biometric.e eVar = new androidx.biometric.e(a2, hVar2);
        f5070c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, eVar, d.a(context, f.f5066a[0]));
        this.f5071a = mVar;
        this.f5072b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = (Bundle) this.f5071a.f310b;
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
        e eVar = this.f5072b.f5062c.f5083b;
        if (eVar != null) {
            Double d11 = eVar.f5064b;
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
