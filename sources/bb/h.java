package bb;

import a6.m;
import android.content.Context;
import android.os.Bundle;
import w7.q;
import za.b0;
import za.r;
public final class h {
    public static final f f3473c = new Object();
    public static final m1.c d = q.a(r.f48849b);
    public final m f3474a;
    public final d f3475b;

    public h(k9.h hVar, id.h hVar2, id.h hVar3, qa.d dVar) {
        hVar.a();
        Context context = hVar.f13549a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        b0 b0Var = b0.f48770a;
        za.b a2 = b0.a(hVar);
        m mVar = new m(context);
        aa.a aVar = new aa.a(a2, hVar2);
        f3473c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, aVar, d.a(context, f.f3469a[0]));
        this.f3474a = mVar;
        this.f3475b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = (Bundle) this.f3474a.f307b;
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
        e eVar = this.f3475b.f3465c.f3489b;
        if (eVar != null) {
            Double d11 = eVar.f3467b;
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
        throw new UnsupportedOperationException("Method not decompiled: bb.h.b(kd.c):java.lang.Object");
    }
}
