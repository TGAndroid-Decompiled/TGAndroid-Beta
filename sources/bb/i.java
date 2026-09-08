package bb;

import android.content.Context;
import android.os.Bundle;
import w7.q;
import za.b0;
import za.r;
public final class i {
    public static final g f2580c = new Object();
    public static final m1.c d = q.a(r.f51505b);
    public final a f2581a;
    public final e f2582b;

    public i(k9.h hVar, id.h hVar2, id.h hVar3, qa.d dVar) {
        hVar.a();
        Context context = hVar.f14882a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        b0 b0Var = b0.f51417a;
        za.b a2 = b0.a(hVar);
        a aVar = new a(context);
        aa.a aVar2 = new aa.a(a2, hVar2);
        f2580c.getClass();
        e eVar = new e(hVar3, dVar, a2, aVar2, d.a(context, g.f2576a[0]));
        this.f2581a = aVar;
        this.f2582b = eVar;
    }

    public final double a() {
        Double d10;
        Bundle bundle = this.f2581a.f2558a;
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
        f fVar = this.f2582b.f2571c.f2597b;
        if (fVar != null) {
            Double d11 = fVar.f2573b;
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
        throw new UnsupportedOperationException("Method not decompiled: bb.i.b(kd.c):java.lang.Object");
    }
}
