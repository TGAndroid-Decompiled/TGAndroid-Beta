package i7;
public abstract class v7 {
    public static sc.c a(bd.p pVar, sc.c cVar, sc.c cVar2) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof uc.a) {
            return ((uc.a) pVar).create(cVar, cVar2);
        }
        sc.h context = cVar2.getContext();
        if (context == sc.i.f47711a) {
            return new tc.b(pVar, cVar2, cVar);
        }
        return new tc.c(cVar2, context, pVar, cVar);
    }

    public static sc.c b(sc.c cVar) {
        uc.c cVar2;
        sc.c intercepted;
        kotlin.jvm.internal.j.e(cVar, "<this>");
        if (cVar instanceof uc.c) {
            cVar2 = (uc.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }
}
