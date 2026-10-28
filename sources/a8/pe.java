package a8;
public abstract class pe {
    public static ld.c a(ld.c cVar, ld.c cVar2, ud.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof nd.a) {
            return ((nd.a) pVar).create(cVar, cVar2);
        }
        ld.h context = cVar2.getContext();
        if (context == ld.i.f16987a) {
            return new md.b(cVar2, cVar, pVar);
        }
        return new md.c(cVar2, context, pVar, cVar);
    }

    public static ld.c b(ld.c cVar) {
        nd.c cVar2;
        ld.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        if (cVar instanceof nd.c) {
            cVar2 = (nd.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }
}
