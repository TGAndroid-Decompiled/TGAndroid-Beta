package de;

import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rd.q;
import zd.e0;
public final class g extends kd.c implements ce.c {
    public final ce.c f6828a;
    public final id.h f6829b;
    public final int f6830c;
    public id.h d;
    public kd.c f6831e;

    public g(ce.c cVar, id.h hVar) {
        super(d.f6825a, id.i.f11980a);
        this.f6828a = cVar;
        this.f6829b = hVar;
        this.f6830c = ((Number) hVar.fold(0, f.f6827b)).intValue();
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        try {
            Object d = d(cVar, obj);
            if (d == jd.a.f13640a) {
                return d;
            }
            return gd.i.f10616a;
        } catch (Throwable th2) {
            this.d = new c(cVar.getContext(), th2);
            throw th2;
        }
    }

    public final Object d(kd.c cVar, Object obj) {
        Comparable comparable;
        int i10;
        String str;
        id.h context = cVar.getContext();
        e0.h(context);
        id.h hVar = this.d;
        if (hVar != context) {
            int i11 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f6823a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                List a2 = wd.d.a(new wd.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!xd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(hd.i.d(arrayList));
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
                int a10 = hd.h.a(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i14 = i11 + 1;
                    if (i11 >= 0) {
                        String str4 = (String) obj4;
                        if ((i11 == 0 || i11 == a10) && xd.j.e(str4)) {
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
                                throw new IllegalArgumentException(i2.g.j(i10, "Requested character count ", " is less than zero.").toString());
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
                hd.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            } else if (((Number) context.fold(0, new j(this))).intValue() == this.f6830c) {
                this.d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f6829b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f6831e = cVar;
        q qVar = i.f6833a;
        ce.c cVar2 = this.f6828a;
        kotlin.jvm.internal.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object c10 = qVar.c(cVar2, obj, this);
        if (!kotlin.jvm.internal.i.a(c10, jd.a.f13640a)) {
            this.f6831e = null;
        }
        return c10;
    }

    @Override
    public final kd.d getCallerFrame() {
        kd.c cVar = this.f6831e;
        if (e2.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        id.h hVar = this.d;
        if (hVar == null) {
            return id.i.f11980a;
        }
        return hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = gd.f.a(obj);
        if (a2 != null) {
            this.d = new c(getContext(), a2);
        }
        kd.c cVar = this.f6831e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return jd.a.f13640a;
    }
}
