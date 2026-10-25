package ge;

import ae.k;
import c3.h0;
import ce.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ud.q;
public final class g extends nd.c implements fe.c {
    public final fe.c f12480a;
    public final ld.h f12481b;
    public final int f12482c;
    public ld.h d;
    public nd.c e;

    public g(fe.c cVar, ld.h hVar) {
        super(d.f12477a, ld.i.f16988a);
        this.f12480a = cVar;
        this.f12481b = hVar;
        this.f12482c = ((Number) hVar.fold(0, f.f12479b)).intValue();
    }

    @Override
    public final Object b(Object obj, nd.c cVar) {
        try {
            Object c10 = c(cVar, obj);
            if (c10 == md.a.f18412a) {
                return c10;
            }
            return jd.i.f15580a;
        } catch (Throwable th2) {
            this.d = new c(th2, cVar.getContext());
            throw th2;
        }
    }

    public final Object c(nd.c cVar, Object obj) {
        Comparable comparable;
        int i10;
        String str;
        ld.h context = cVar.getContext();
        f0.h(context);
        ld.h hVar = this.d;
        if (hVar != context) {
            int i11 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f12475a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                List a2 = zd.d.a(new ae.j(str2, 0));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!k.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kd.i.d(arrayList));
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            char charAt = str3.charAt(i13);
                            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                                break;
                            }
                            i13++;
                        } else {
                            i13 = -1;
                            break;
                        }
                    }
                    if (i13 == -1) {
                        i13 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i13));
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
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                int length2 = str2.length();
                a2.size();
                int b10 = kd.h.b(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i14 = i11 + 1;
                    if (i11 >= 0) {
                        String str4 = (String) obj4;
                        if ((i11 == 0 || i11 == b10) && k.e(str4)) {
                            str = null;
                        } else {
                            kotlin.jvm.internal.i.e(str4, "<this>");
                            if (i10 >= 0) {
                                int length3 = str4.length();
                                if (i10 <= length3) {
                                    length3 = i10;
                                }
                                str = str4.substring(length3);
                                kotlin.jvm.internal.i.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(ic.a.j(i10, "Requested character count ", " is less than zero.").toString());
                            }
                        }
                        if (str != null) {
                            arrayList3.add(str);
                        }
                        i11 = i14;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                StringBuilder sb2 = new StringBuilder(length2);
                kd.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            } else if (((Number) context.fold(0, new j(this))).intValue() == this.f12482c) {
                this.d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f12481b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.e = cVar;
        q qVar = i.f12484a;
        fe.c cVar2 = this.f12480a;
        kotlin.jvm.internal.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object a10 = qVar.a(cVar2, obj, this);
        if (!kotlin.jvm.internal.i.a(a10, md.a.f18412a)) {
            this.e = null;
        }
        return a10;
    }

    @Override
    public final nd.d getCallerFrame() {
        nd.c cVar = this.e;
        if (h0.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final ld.h getContext() {
        ld.h hVar = this.d;
        if (hVar == null) {
            return ld.i.f16988a;
        }
        return hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = jd.f.a(obj);
        if (a2 != null) {
            this.d = new c(a2, getContext());
        }
        nd.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return md.a.f18412a;
    }
}
