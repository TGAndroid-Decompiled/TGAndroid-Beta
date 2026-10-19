package fe;

import be.f0;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import td.q;
public final class g extends md.c implements ee.c {
    public final ee.c f10590a;
    public final kd.h f10591b;
    public final int f10592c;
    public kd.h d;
    public md.c e;

    public g(ee.c cVar, kd.h hVar) {
        super(d.f10587a, kd.i.f15031a);
        this.f10590a = cVar;
        this.f10591b = hVar;
        this.f10592c = ((Number) hVar.fold(0, f.f10589b)).intValue();
    }

    @Override
    public final Object a(Object obj, md.c cVar) {
        try {
            Object c10 = c(cVar, obj);
            if (c10 == ld.a.f16001a) {
                return c10;
            }
            return id.i.f12777a;
        } catch (Throwable th2) {
            this.d = new c(th2, cVar.getContext());
            throw th2;
        }
    }

    public final Object c(md.c cVar, Object obj) {
        Comparable comparable;
        int i10;
        String str;
        kd.h context = cVar.getContext();
        f0.h(context);
        kd.h hVar = this.d;
        if (hVar != context) {
            int i11 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f10585a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                List a2 = yd.d.a(new yd.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!zd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(jd.i.d(arrayList));
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
                int a10 = jd.h.a(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i14 = i11 + 1;
                    if (i11 >= 0) {
                        String str4 = (String) obj4;
                        if ((i11 == 0 || i11 == a10) && zd.j.e(str4)) {
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
                                throw new IllegalArgumentException(i2.e.k(i10, "Requested character count ", " is less than zero.").toString());
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
                jd.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            } else if (((Number) context.fold(0, new j(this))).intValue() == this.f10592c) {
                this.d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f10591b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.e = cVar;
        q qVar = i.f10594a;
        ee.c cVar2 = this.f10590a;
        kotlin.jvm.internal.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object b10 = qVar.b(cVar2, obj, this);
        if (!kotlin.jvm.internal.i.a(b10, ld.a.f16001a)) {
            this.e = null;
        }
        return b10;
    }

    @Override
    public final md.d getCallerFrame() {
        md.c cVar = this.e;
        if (k3.s(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final kd.h getContext() {
        kd.h hVar = this.d;
        if (hVar == null) {
            return kd.i.f15031a;
        }
        return hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = id.f.a(obj);
        if (a2 != null) {
            this.d = new c(a2, getContext());
        }
        md.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return ld.a.f16001a;
    }
}
