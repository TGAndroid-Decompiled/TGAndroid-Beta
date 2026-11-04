package ae;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.p1;
import wd.b0;
public final class k extends hd.c implements zd.c {
    public final zd.c f403a;
    public final fd.h f404b;
    public final int f405c;
    public fd.h d;
    public fd.c f406e;

    public k(zd.c cVar, fd.h hVar) {
        super(h.f400a, fd.i.f11567a);
        this.f403a = cVar;
        this.f404b = hVar;
        this.f405c = ((Number) hVar.fold(0, new j(0))).intValue();
    }

    @Override
    public final Object b(Object obj, fd.c cVar) {
        try {
            Object c2 = c(cVar, obj);
            if (c2 == gd.a.f12241a) {
                return c2;
            }
            return dd.k.f8801a;
        } catch (Throwable th2) {
            this.d = new f(cVar.getContext(), th2);
            throw th2;
        }
    }

    public final Object c(fd.c cVar, Object obj) {
        Comparable comparable;
        int i3;
        String str;
        fd.h context = cVar.getContext();
        b0.g(context);
        fd.h hVar = this.d;
        if (hVar != context) {
            if (!(hVar instanceof f)) {
                if (((Number) context.fold(0, new od.p() {
                    @Override
                    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
                        throw new UnsupportedOperationException("Method not decompiled: ae.n.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                })).intValue() == this.f405c) {
                    this.d = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f404b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((f) hVar).f399b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                List a10 = td.d.a(new td.e(str2, 2));
                List list = a10;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!ud.d.j((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ed.i.d(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            char charAt = str3.charAt(i12);
                            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    if (i12 == -1) {
                        i12 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i12));
                }
                Iterator it = arrayList2.iterator();
                if (!it.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                int length2 = str2.length();
                a10.size();
                int b10 = ed.h.b(a10);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i13 = i10 + 1;
                    if (i10 >= 0) {
                        String str4 = (String) obj4;
                        if ((i10 == 0 || i10 == b10) && ud.d.j(str4)) {
                            str = null;
                        } else {
                            kotlin.jvm.internal.j.e(str4, "<this>");
                            if (i3 >= 0) {
                                int length3 = str4.length();
                                if (i3 <= length3) {
                                    length3 = i3;
                                }
                                str = str4.substring(length3);
                                kotlin.jvm.internal.j.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(p1.j(i3, "Requested character count ", " is less than zero.").toString());
                            }
                        }
                        if (str != null) {
                            arrayList3.add(str);
                        }
                        i10 = i13;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                StringBuilder sb2 = new StringBuilder(length2);
                ed.g.f(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        this.f406e = cVar;
        od.q qVar = m.f408a;
        zd.c cVar2 = this.f403a;
        kotlin.jvm.internal.j.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object a11 = qVar.a(cVar2, obj, this);
        if (!kotlin.jvm.internal.j.a(a11, gd.a.f12241a)) {
            this.f406e = null;
        }
        return a11;
    }

    @Override
    public final hd.d getCallerFrame() {
        fd.c cVar = this.f406e;
        if (cVar instanceof hd.d) {
            return (hd.d) cVar;
        }
        return null;
    }

    @Override
    public final fd.h getContext() {
        fd.h hVar = this.d;
        if (hVar == null) {
            return fd.i.f11567a;
        }
        return hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a10 = dd.g.a(obj);
        if (a10 != null) {
            this.d = new f(getContext(), a10);
        }
        fd.c cVar = this.f406e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return gd.a.f12241a;
    }
}
