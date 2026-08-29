package la;

import android.content.Context;
import android.os.Bundle;
import i7.x;
import ja.f0;
import ja.s;
import l3.g0;
public final class h {
    public static final f f15128c = new Object();
    public static final m1.c d = x.a(s.f11401b);
    public final m5.i f15129a;
    public final d f15130b;

    public h(u8.g gVar, sc.h hVar, sc.h hVar2, aa.d dVar) {
        gVar.a();
        Context context = gVar.f49131a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        f0 f0Var = f0.f11333a;
        ja.b a2 = f0.a(gVar);
        m5.i iVar = new m5.i(context, 22);
        g0 g0Var = new g0(a2, hVar);
        f15128c.getClass();
        d dVar2 = new d(hVar2, dVar, a2, g0Var, d.a(context, f.f15124a[0]));
        this.f15129a = iVar;
        this.f15130b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = (Bundle) this.f15129a.f16880b;
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
        e eVar = this.f15130b.f15119c.f15142b;
        if (eVar != null) {
            Double d11 = eVar.f15121b;
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

    public final java.lang.Object b(uc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: la.h.b(uc.c):java.lang.Object");
    }
}
