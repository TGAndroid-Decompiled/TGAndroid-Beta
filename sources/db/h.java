package db;

import a8.fe;
import a8.h0;
import android.content.Context;
import android.os.Bundle;
import bb.f0;
import bb.s;
public final class h {
    public static final f f8295c = new Object();
    public static final m1.c d = fe.a(s.f3817b);
    public final za.c f8296a;
    public final d f8297b;

    public h(m9.h hVar, ld.h hVar2, ld.h hVar3, sa.d dVar) {
        hVar.a();
        Context context = hVar.f18380a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        f0 f0Var = f0.f3755a;
        bb.b a2 = f0.a(hVar);
        za.c cVar = new za.c(context);
        h0 h0Var = new h0(a2, hVar2);
        f8295c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, h0Var, d.a(context, f.f8291a[0]));
        this.f8296a = cVar;
        this.f8297b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = (Bundle) this.f8296a.f52844b;
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
        e eVar = this.f8297b.f8287c.f8308b;
        if (eVar != null) {
            Double d11 = eVar.f8289b;
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

    public final java.lang.Object b(nd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: db.h.b(nd.c):java.lang.Object");
    }
}
