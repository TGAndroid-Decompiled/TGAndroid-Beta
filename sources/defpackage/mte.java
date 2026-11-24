package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class mte extends cte {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override
    public final void a(qpe qpeVar, qpe qpeVar2, long j) {
        ArrayList arrayList;
        List list = (List) k2f.l(qpeVar2, j);
        int size = list.size();
        List list2 = (List) k2f.l(qpeVar, j);
        if (list2.isEmpty()) {
            if (list2 instanceof hte) {
                list2 = new sse(size);
            } else if ((list2 instanceof aye) && (list2 instanceof nre)) {
                list2 = ((nre) list2).zza(size);
            } else {
                list2 = new ArrayList(size);
            }
            k2f.d(qpeVar, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                k2f.d(qpeVar, j, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof w1f) {
                w1f w1fVar = (w1f) list2;
                List sseVar = new sse(w1fVar.a.size() + size);
                sseVar.addAll(w1fVar);
                k2f.d(qpeVar, j, sseVar);
                arrayList = sseVar;
            } else if ((list2 instanceof aye) && (list2 instanceof nre)) {
                nre nreVar = (nre) list2;
                if (!nreVar.zza()) {
                    list2 = nreVar.zza(list2.size() + size);
                    k2f.d(qpeVar, j, list2);
                }
            }
            list2 = arrayList;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        k2f.d(qpeVar, j, list);
    }
}
