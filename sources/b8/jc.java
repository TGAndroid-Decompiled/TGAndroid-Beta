package b8;
public abstract class jc {
    public static fd.c a(fd.c cVar, fd.c cVar2, od.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof hd.a) {
            return ((hd.a) pVar).create(cVar, cVar2);
        }
        fd.h context = cVar2.getContext();
        if (context == fd.i.f11567a) {
            return new gd.b(cVar2, cVar, pVar);
        }
        return new gd.c(cVar2, context, pVar, cVar);
    }

    public static fd.c b(fd.c cVar) {
        hd.c cVar2;
        fd.c intercepted;
        kotlin.jvm.internal.j.e(cVar, "<this>");
        if (cVar instanceof hd.c) {
            cVar2 = (hd.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }

    public static Object c(od.p pVar, Object obj, fd.c cVar) {
        Object cVar2;
        kotlin.jvm.internal.j.e(pVar, "<this>");
        fd.h context = cVar.getContext();
        if (context == fd.i.f11567a) {
            cVar2 = new hd.h(cVar);
        } else {
            cVar2 = new hd.c(cVar, context);
        }
        kotlin.jvm.internal.u.a(2, pVar);
        return pVar.invoke(obj, cVar2);
    }
}
