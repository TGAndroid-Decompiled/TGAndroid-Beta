package de;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rd.p;
import rd.q;
import zd.b0;
public final class h extends kd.c implements ce.d {
    public final ce.d f8680a;
    public final id.h f8681b;
    public final int f8682c;
    public id.h d;
    public id.c f8683e;

    public h(ce.d dVar, id.h hVar) {
        super(f.f8678a, id.i.f15456a);
        this.f8680a = dVar;
        this.f8681b = hVar;
        this.f8682c = ((Number) hVar.fold(0, new b1.e(3))).intValue();
    }

    @Override
    public final Object a(Object obj, id.c cVar) {
        try {
            Object c10 = c(cVar, obj);
            if (c10 == jd.a.f16646a) {
                return c10;
            }
            return gd.k.f13829a;
        } catch (Throwable th2) {
            this.d = new d(cVar.getContext(), th2);
            throw th2;
        }
    }

    public final Object c(id.c cVar, Object obj) {
        Comparable comparable;
        int i7;
        String str;
        id.h context = cVar.getContext();
        b0.g(context);
        id.h hVar = this.d;
        if (hVar != context) {
            if (!(hVar instanceof d)) {
                if (((Number) context.fold(0, new p() {
                    @Override
                    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
                        throw new UnsupportedOperationException("Method not decompiled: de.k.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                })).intValue() == this.f8682c) {
                    this.d = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f8681b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((d) hVar).f8677b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                List a10 = wd.d.a(new wd.e(str2, 2));
                List list = a10;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!xd.d.j((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(hd.h.d(arrayList, 10));
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
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                int length2 = str2.length();
                a10.size();
                int b10 = hd.g.b(a10);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i13 = i10 + 1;
                    if (i10 >= 0) {
                        String str4 = (String) obj4;
                        if ((i10 == 0 || i10 == b10) && xd.d.j(str4)) {
                            str = null;
                        } else {
                            kotlin.jvm.internal.j.e(str4, "<this>");
                            if (i7 >= 0) {
                                int length3 = str4.length();
                                if (i7 <= length3) {
                                    length3 = i7;
                                }
                                str = str4.substring(length3);
                                kotlin.jvm.internal.j.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(jg.g.k(i7, "Requested character count ", " is less than zero.").toString());
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
                hd.f.f(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        this.f8683e = cVar;
        q qVar = j.f8685a;
        ce.d dVar = this.f8680a;
        kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object b11 = qVar.b(dVar, obj, this);
        if (!kotlin.jvm.internal.j.a(b11, jd.a.f16646a)) {
            this.f8683e = null;
        }
        return b11;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.f8683e;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        id.h hVar = this.d;
        if (hVar == null) {
            return id.i.f15456a;
        }
        return hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a10 = gd.g.a(obj);
        if (a10 != null) {
            this.d = new d(getContext(), a10);
        }
        id.c cVar = this.f8683e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return jd.a.f16646a;
    }
}
