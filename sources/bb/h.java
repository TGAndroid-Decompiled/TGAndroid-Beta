package bb;

import android.content.Context;
import android.os.Bundle;
import w7.r;
import za.b0;
public final class h {
    public static final f f3472c = new Object();
    public static final m1.c d = r.a(za.r.f49146b);
    public final pb.c f3473a;
    public final d f3474b;

    public h(k9.h hVar, id.h hVar2, id.h hVar3, qa.d dVar) {
        hVar.a();
        Context context = hVar.f13548a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        b0 b0Var = b0.f49067a;
        za.b a2 = b0.a(hVar);
        pb.c cVar = new pb.c(context);
        aa.a aVar = new aa.a(a2, hVar2);
        f3472c.getClass();
        d dVar2 = new d(hVar3, dVar, a2, aVar, d.a(context, f.f3468a[0]));
        this.f3473a = cVar;
        this.f3474b = dVar2;
    }

    public final double a() {
        Double d10;
        Bundle bundle = (Bundle) this.f3473a.f41066b;
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
        e eVar = this.f3474b.f3464c.f3488b;
        if (eVar != null) {
            Double d11 = eVar.f3466b;
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
