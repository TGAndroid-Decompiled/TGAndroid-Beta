package ld;

import hd.f0;
import j3.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zc.q;
public final class g extends sc.c implements kd.c {
    public final kd.c f16845a;
    public final qc.h f16846b;
    public final int f16847c;
    public qc.h d;
    public sc.c f16848e;

    public g(kd.c cVar, qc.h hVar) {
        super(d.f16842a, qc.i.f46140a);
        this.f16845a = cVar;
        this.f16846b = hVar;
        this.f16847c = ((Number) hVar.fold(0, f.f16844b)).intValue();
    }

    @Override
    public final Object c(Object obj, sc.c cVar) {
        try {
            Object d = d(cVar, obj);
            if (d == rc.a.f47127a) {
                return d;
            }
            return oc.i.f19197a;
        } catch (Throwable th) {
            this.d = new c(th, cVar.getContext());
            throw th;
        }
    }

    public final Object d(sc.c cVar, Object obj) {
        Comparable comparable;
        int i9;
        String str;
        qc.h context = cVar.getContext();
        f0.h(context);
        qc.h hVar = this.d;
        if (hVar != context) {
            int i10 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f16840a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                List a2 = ed.d.a(new ed.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!fd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(pc.i.d(arrayList));
                int size = arrayList.size();
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
                    i9 = num.intValue();
                } else {
                    i9 = 0;
                }
                int length2 = str2.length();
                a2.size();
                int b10 = pc.h.b(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i13 = i10 + 1;
                    if (i10 >= 0) {
                        String str4 = (String) obj4;
                        if ((i10 == 0 || i10 == b10) && fd.j.e(str4)) {
                            str = null;
                        } else {
                            kotlin.jvm.internal.i.e(str4, "<this>");
                            if (i9 >= 0) {
                                int length3 = str4.length();
                                if (i9 <= length3) {
                                    length3 = i9;
                                }
                                str = str4.substring(length3);
                                kotlin.jvm.internal.i.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(r0.m(i9, "Requested character count ", " is less than zero.").toString());
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
                pc.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            } else if (((Number) context.fold(0, new j(this))).intValue() == this.f16847c) {
                this.d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f16846b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f16848e = cVar;
        q qVar = i.f16850a;
        kd.c cVar2 = this.f16845a;
        kotlin.jvm.internal.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object a3 = qVar.a(cVar2, obj, this);
        if (!kotlin.jvm.internal.i.a(a3, rc.a.f47127a)) {
            this.f16848e = null;
        }
        return a3;
    }

    @Override
    public final sc.d getCallerFrame() {
        sc.c cVar = this.f16848e;
        if (e2.c.v(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final qc.h getContext() {
        qc.h hVar = this.d;
        if (hVar == null) {
            return qc.i.f46140a;
        }
        return hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = oc.f.a(obj);
        if (a2 != null) {
            this.d = new c(a2, getContext());
        }
        sc.c cVar = this.f16848e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return rc.a.f47127a;
    }
}
