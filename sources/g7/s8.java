package g7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class s8 {
    public static final Object a(List list, k1.s sVar, tc.c cVar) throws Throwable {
        k1.c cVar2;
        List list2;
        kotlin.jvm.internal.q qVar;
        Iterator it;
        Throwable th;
        ad.l lVar;
        if (cVar instanceof k1.c) {
            cVar2 = (k1.c) cVar;
            int i10 = cVar2.d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.d = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new k1.c(cVar);
            }
        } else {
            cVar2 = new k1.c(cVar);
        }
        Object obj = cVar2.f14262c;
        Object obj2 = sc.a.f47847a;
        int i11 = cVar2.d;
        if (i11 != 0) {
            if (i11 == 1) {
                list2 = (List) cVar2.f14260a;
                h7.k6.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = cVar2.f14261b;
                qVar = (kotlin.jvm.internal.q) cVar2.f14260a;
                try {
                    h7.k6.b(obj);
                } catch (Throwable th2) {
                    Object obj3 = qVar.f15253a;
                    if (obj3 == null) {
                        qVar.f15253a = th2;
                    } else {
                        h7.i6.a((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                lVar = (ad.l) it.next();
                cVar2.f14260a = qVar;
                cVar2.f14261b = it;
                cVar2.d = 2;
                if (lVar.invoke(cVar2) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) qVar.f15253a;
            if (th == null) {
                return pc.i.f45696a;
            }
            throw th;
        }
        h7.k6.b(obj);
        ArrayList arrayList = new ArrayList();
        k1.e eVar = new k1.e(list, arrayList, null);
        cVar2.f14260a = arrayList;
        cVar2.d = 1;
        if (sVar.a(eVar, cVar2) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        qVar = new kotlin.jvm.internal.q();
        it = list2.iterator();
        while (it.hasNext()) {
            lVar = (ad.l) it.next();
            cVar2.f14260a = qVar;
            cVar2.f14261b = it;
            cVar2.d = 2;
            if (lVar.invoke(cVar2) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) qVar.f15253a;
        if (th == null) {
            return pc.i.f45696a;
        }
        throw th;
    }
}
