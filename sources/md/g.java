package md;

import ad.q;
import id.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g extends tc.c implements ld.c {

    public final ld.c f18029a;

    public final rc.h f18030b;

    public final int f18031c;
    public rc.h d;

    public tc.c f18032e;

    public g(ld.c cVar, rc.h hVar) {
        super(d.f18026a, rc.i.f46899a);
        this.f18029a = cVar;
        this.f18030b = hVar;
        this.f18031c = ((Number) hVar.fold(0, f.f18028b)).intValue();
    }

    @Override
    public final Object c(Object obj, tc.c cVar) {
        try {
            Object objD = d(cVar, obj);
            return objD == sc.a.f47847a ? objD : pc.i.f45696a;
        } catch (Throwable th) {
            this.d = new c(th, cVar.getContext());
            throw th;
        }
    }

    public final Object d(tc.c cVar, Object obj) {
        Comparable comparable;
        String strSubstring;
        rc.h context = cVar.getContext();
        f0.h(context);
        rc.h hVar = this.d;
        if (hVar != context) {
            int i10 = 0;
            if (hVar instanceof c) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f18024a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str, "<this>");
                List listA = fd.d.a(new fd.e(str, 2));
                List list = listA;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!gd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(qc.i.d(arrayList));
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    String str2 = (String) obj3;
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(length2);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(length2));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listA.size();
                int iB = qc.h.b(listA);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str3 = (String) obj4;
                    if ((i10 == 0 || i10 == iB) && gd.j.e(str3)) {
                        strSubstring = null;
                    } else {
                        kotlin.jvm.internal.j.e(str3, "<this>");
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(i0.a.l(iIntValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                        kotlin.jvm.internal.j.d(strSubstring, "substring(...)");
                    }
                    if (strSubstring != null) {
                        arrayList3.add(strSubstring);
                    }
                    i10 = i12;
                }
                StringBuilder sb2 = new StringBuilder(length3);
                qc.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (((Number) context.fold(0, new j(this))).intValue() != this.f18031c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f18030b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.f18032e = cVar;
        q qVar = i.f18034a;
        ld.c cVar2 = this.f18029a;
        kotlin.jvm.internal.j.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objA = qVar.a(cVar2, obj, this);
        if (!kotlin.jvm.internal.j.a(objA, sc.a.f47847a)) {
            this.f18032e = null;
        }
        return objA;
    }

    @Override
    public final tc.d getCallerFrame() {
        tc.c cVar = this.f18032e;
        if (com.google.android.recaptcha.internal.a.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final rc.h getContext() {
        rc.h hVar = this.d;
        return hVar == null ? rc.i.f46899a : hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable thA = pc.f.a(obj);
        if (thA != null) {
            this.d = new c(thA, getContext());
        }
        tc.c cVar = this.f18032e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return sc.a.f47847a;
    }
}
