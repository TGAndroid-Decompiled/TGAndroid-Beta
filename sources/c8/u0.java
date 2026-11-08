package c8;
public abstract class u0 {
    public static id.c a(id.c cVar, id.c cVar2, rd.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof kd.a) {
            return ((kd.a) pVar).create(cVar, cVar2);
        }
        id.h context = cVar2.getContext();
        if (context == id.i.f15456a) {
            return new jd.b(cVar2, cVar, pVar);
        }
        return new jd.c(cVar2, context, pVar, cVar);
    }

    public static id.c b(id.c cVar) {
        kd.c cVar2;
        id.c intercepted;
        kotlin.jvm.internal.j.e(cVar, "<this>");
        if (cVar instanceof kd.c) {
            cVar2 = (kd.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }

    public static Object c(rd.p pVar, Object obj, id.c cVar) {
        Object cVar2;
        kotlin.jvm.internal.j.e(pVar, "<this>");
        id.h context = cVar.getContext();
        if (context == id.i.f15456a) {
            cVar2 = new kd.h(cVar);
        } else {
            cVar2 = new kd.c(cVar, context);
        }
        kotlin.jvm.internal.u.a(2, pVar);
        return pVar.invoke(obj, cVar2);
    }
}
