package db;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.a0;
import bb.f0;
import bb.s;
import w7.v;
public final class h {
    public static final f f5848c = new Object();
    public static final m1.c d = v.a(s.f2618b);
    public final za.c f5849a;
    public final d f5850b;

    public h(l9.h hVar, cd.h hVar2, cd.h hVar3, ra.d dVar) {
        hVar.a();
        Context context = hVar.f11708a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        f0 f0Var = f0.f2555a;
        bb.b a2 = f0.a(hVar);
        za.c cVar = new za.c(context);
        a0 a0Var = new a0(a2, hVar2);
        f5848c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, a0Var, d.a(context, f.f5844a[0]));
        this.f5849a = cVar;
        this.f5850b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = (Bundle) this.f5849a.f55450b;
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
        e eVar = this.f5850b.f5840c.f5861b;
        if (eVar != null) {
            Double d11 = eVar.f5842b;
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

    public final java.lang.Object b(ed.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: db.h.b(ed.c):java.lang.Object");
    }
}
