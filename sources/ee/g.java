package ee;

import ae.g0;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sd.q;
public final class g extends ld.c implements de.c {
    public final de.c f8908a;
    public final jd.h f8909b;
    public final int f8910c;
    public jd.h d;
    public ld.c f8911e;

    public g(de.c cVar, jd.h hVar) {
        super(d.f8905a, jd.i.f14129a);
        this.f8908a = cVar;
        this.f8909b = hVar;
        this.f8910c = ((Number) hVar.fold(0, f.f8907b)).intValue();
    }

    @Override
    public final Object b(Object obj, ld.c cVar) {
        try {
            Object d = d(cVar, obj);
            if (d == kd.a.f14784a) {
                return d;
            }
            return hd.i.f11092a;
        } catch (Throwable th2) {
            this.d = new c(th2, cVar.getContext());
            throw th2;
        }
    }

    public final Object d(ld.c cVar, Object obj) {
        Comparable comparable;
        int i10;
        String str;
        jd.h context = cVar.getContext();
        g0.h(context);
        jd.h hVar = this.d;
        if (hVar != context) {
            int i11 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f8903a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                List a2 = xd.d.a(new xd.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!yd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(id.i.d(arrayList));
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
                int a10 = id.h.a(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i14 = i11 + 1;
                    if (i11 >= 0) {
                        String str4 = (String) obj4;
                        if ((i11 == 0 || i11 == a10) && yd.j.e(str4)) {
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
                                throw new IllegalArgumentException(hg.c.i(i10, "Requested character count ", " is less than zero.").toString());
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
                id.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            } else if (((Number) context.fold(0, new j(this))).intValue() == this.f8910c) {
                this.d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f8909b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f8911e = cVar;
        q qVar = i.f8913a;
        de.c cVar2 = this.f8908a;
        kotlin.jvm.internal.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object c10 = qVar.c(cVar2, obj, this);
        if (!kotlin.jvm.internal.i.a(c10, kd.a.f14784a)) {
            this.f8911e = null;
        }
        return c10;
    }

    @Override
    public final ld.d getCallerFrame() {
        ld.c cVar = this.f8911e;
        if (e2.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final jd.h getContext() {
        jd.h hVar = this.d;
        if (hVar == null) {
            return jd.i.f14129a;
        }
        return hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = hd.f.a(obj);
        if (a2 != null) {
            this.d = new c(a2, getContext());
        }
        ld.c cVar = this.f8911e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return kd.a.f14784a;
    }
}
