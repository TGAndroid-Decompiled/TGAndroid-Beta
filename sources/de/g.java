package de;

import aa.b0;
import c8.v0;
import com.google.android.gms.internal.vision.e2;
import kotlin.jvm.internal.u;
import rd.p;
public abstract class g {
    public static final b0 f8066a = new b0("NULL", 1);

    public static final Object a(id.h hVar, Object obj, Object obj2, p pVar, id.c frame) {
        Object invoke;
        Object l10 = ee.a.l(hVar, obj2);
        try {
            m mVar = new m(frame, hVar);
            if (!e2.s(pVar)) {
                invoke = v0.c(pVar, obj, mVar);
            } else {
                u.a(2, pVar);
                invoke = pVar.invoke(obj, mVar);
            }
            ee.a.g(hVar, l10);
            if (invoke == jd.a.f16999a) {
                kotlin.jvm.internal.j.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th2) {
            ee.a.g(hVar, l10);
            throw th2;
        }
    }
}
