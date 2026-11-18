package de;

import c8.x0;
import com.google.android.gms.internal.vision.e2;
import ee.t;
import kotlin.jvm.internal.u;
import rd.p;
public abstract class g {
    public static final t f8348a = new t("NULL", 0);

    public static final Object a(id.h hVar, Object obj, Object obj2, p pVar, id.c frame) {
        Object invoke;
        Object l10 = ee.a.l(hVar, obj2);
        try {
            m mVar = new m(frame, hVar);
            if (!e2.s(pVar)) {
                invoke = x0.c(pVar, obj, mVar);
            } else {
                u.a(2, pVar);
                invoke = pVar.invoke(obj, mVar);
            }
            ee.a.g(hVar, l10);
            if (invoke == jd.a.f17381a) {
                kotlin.jvm.internal.j.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th2) {
            ee.a.g(hVar, l10);
            throw th2;
        }
    }
}
