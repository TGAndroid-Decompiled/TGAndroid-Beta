package g7;
public abstract class g7 {
    public static qc.c a(qc.c cVar, qc.c cVar2, zc.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof sc.a) {
            return ((sc.a) pVar).create(cVar, cVar2);
        }
        qc.h context = cVar2.getContext();
        if (context == qc.i.f46140a) {
            return new rc.b(cVar2, cVar, pVar);
        }
        return new rc.c(cVar2, context, pVar, cVar);
    }

    public static qc.c b(qc.c cVar) {
        sc.c cVar2;
        qc.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        if (cVar instanceof sc.c) {
            cVar2 = (sc.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }
}
