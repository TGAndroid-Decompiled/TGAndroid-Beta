package nd;

import bd.q;
import j7.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jd.e0;
public final class g extends uc.c implements md.c {
    public final md.c f17312a;
    public final sc.h f17313b;
    public final int f17314c;
    public sc.h d;
    public uc.c f17315e;

    public g(md.c cVar, sc.h hVar) {
        super(d.f17309a, sc.i.f47711a);
        this.f17312a = cVar;
        this.f17313b = hVar;
        this.f17314c = ((Number) hVar.fold(0, f.f17311b)).intValue();
    }

    @Override
    public final Object c(Object obj, uc.c cVar) {
        try {
            Object d = d(cVar, obj);
            if (d == tc.a.f48210a) {
                return d;
            }
            return qc.i.f46603a;
        } catch (Throwable th2) {
            this.d = new c(th2, cVar.getContext());
            throw th2;
        }
    }

    public final Object d(uc.c cVar, Object obj) {
        Comparable comparable;
        int i10;
        String str;
        sc.h context = cVar.getContext();
        e0.h(context);
        sc.h hVar = this.d;
        if (hVar != context) {
            int i11 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f17307a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                List a2 = gd.d.a(new gd.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!hd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(rc.i.d(arrayList));
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
                int b10 = rc.h.b(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i14 = i11 + 1;
                    if (i11 >= 0) {
                        String str4 = (String) obj4;
                        if ((i11 == 0 || i11 == b10) && hd.j.e(str4)) {
                            str = null;
                        } else {
                            kotlin.jvm.internal.j.e(str4, "<this>");
                            if (i10 >= 0) {
                                int length3 = str4.length();
                                if (i10 <= length3) {
                                    length3 = i10;
                                }
                                str = str4.substring(length3);
                                kotlin.jvm.internal.j.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(l1.l(i10, "Requested character count ", " is less than zero.").toString());
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
                rc.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            } else if (((Number) context.fold(0, new j(this))).intValue() == this.f17314c) {
                this.d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f17313b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f17315e = cVar;
        q qVar = i.f17317a;
        md.c cVar2 = this.f17312a;
        kotlin.jvm.internal.j.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object b11 = qVar.b(cVar2, obj, this);
        if (!kotlin.jvm.internal.j.a(b11, tc.a.f48210a)) {
            this.f17315e = null;
        }
        return b11;
    }

    @Override
    public final uc.d getCallerFrame() {
        uc.c cVar = this.f17315e;
        if (com.google.android.recaptcha.internal.a.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final sc.h getContext() {
        sc.h hVar = this.d;
        if (hVar == null) {
            return sc.i.f47711a;
        }
        return hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = qc.f.a(obj);
        if (a2 != null) {
            this.d = new c(a2, getContext());
        }
        uc.c cVar = this.f17315e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return tc.a.f48210a;
    }
}
