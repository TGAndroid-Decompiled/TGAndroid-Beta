package bb;

import a6.m;
import android.content.Context;
import android.os.Bundle;
import w7.q;
import za.b0;
import za.r;
public final class h {
    public static final f f3468c = new Object();
    public static final m1.c d = q.a(r.f48826b);
    public final m f3469a;
    public final d f3470b;

    public h(k9.h hVar, id.h hVar2, id.h hVar3, qa.d dVar) {
        hVar.a();
        Context context = hVar.f13546a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        b0 b0Var = b0.f48747a;
        za.b a2 = b0.a(hVar);
        m mVar = new m(context);
        aa.a aVar = new aa.a(a2, hVar2);
        f3468c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, aVar, d.a(context, f.f3464a[0]));
        this.f3469a = mVar;
        this.f3470b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = (Bundle) this.f3469a.f305b;
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
        e eVar = this.f3470b.f3460c.f3484b;
        if (eVar != null) {
            Double d11 = eVar.f3462b;
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
