package h7;

public abstract class h7 {
    public static rc.c a(ad.p pVar, rc.c cVar, rc.c cVar2) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof tc.a) {
            return ((tc.a) pVar).create(cVar, cVar2);
        }
        rc.h context = cVar2.getContext();
        return context == rc.i.f46899a ? new sc.b(pVar, cVar2, cVar) : new sc.c(cVar2, context, pVar, cVar);
    }

    public static rc.c b(rc.c cVar) {
        rc.c cVarIntercepted;
        kotlin.jvm.internal.j.e(cVar, "<this>");
        tc.c cVar2 = cVar instanceof tc.c ? (tc.c) cVar : null;
        return (cVar2 == null || (cVarIntercepted = cVar2.intercepted()) == null) ? cVar : cVarIntercepted;
    }
}
