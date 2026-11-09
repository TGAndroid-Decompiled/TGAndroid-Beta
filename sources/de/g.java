package de;

import c8.u0;
import kotlin.jvm.internal.u;
import rd.p;
public abstract class g {
    public static final com.google.android.gms.internal.clearcut.e f8677a = new com.google.android.gms.internal.clearcut.e("NULL", 1);

    public static final Object a(id.h hVar, Object obj, Object obj2, p pVar, id.c frame) {
        Object invoke;
        Object l10 = ee.a.l(hVar, obj2);
        try {
            m mVar = new m(frame, hVar);
            if (!com.google.android.recaptcha.internal.a.u(pVar)) {
                invoke = u0.c(pVar, obj, mVar);
            } else {
                u.a(2, pVar);
                invoke = pVar.invoke(obj, mVar);
            }
            ee.a.g(hVar, l10);
            if (invoke == jd.a.f16646a) {
                kotlin.jvm.internal.j.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th2) {
            ee.a.g(hVar, l10);
            throw th2;
        }
    }
}
