package k7;
public abstract class h8 {
    public static uc.c a(dd.p pVar, uc.c cVar, uc.c cVar2) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof wc.a) {
            return ((wc.a) pVar).create(cVar, cVar2);
        }
        uc.h context = cVar2.getContext();
        if (context == uc.i.f48480a) {
            return new vc.b(pVar, cVar2, cVar);
        }
        return new vc.c(cVar2, context, pVar, cVar);
    }

    public static uc.c b(uc.c cVar) {
        wc.c cVar2;
        uc.c intercepted;
        kotlin.jvm.internal.j.e(cVar, "<this>");
        if (cVar instanceof wc.c) {
            cVar2 = (wc.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }
}
