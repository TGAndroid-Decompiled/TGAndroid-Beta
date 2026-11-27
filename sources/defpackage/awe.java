package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class awe extends qve {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override
    public final void a(ese eseVar, ese eseVar2, long j) {
        ArrayList arrayList;
        List list = (List) a5f.l(eseVar2, j);
        int size = list.size();
        List list2 = (List) a5f.l(eseVar, j);
        if (list2.isEmpty()) {
            if (list2 instanceof vve) {
                list2 = new gve(size);
            } else if ((list2 instanceof p0f) && (list2 instanceof bue)) {
                list2 = ((bue) list2).zza(size);
            } else {
                list2 = new ArrayList(size);
            }
            a5f.d(j, eseVar, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                a5f.d(j, eseVar, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof l4f) {
                l4f l4fVar = (l4f) list2;
                List gveVar = new gve(l4fVar.a.size() + size);
                gveVar.addAll(l4fVar);
                a5f.d(j, eseVar, gveVar);
                arrayList = gveVar;
            } else if ((list2 instanceof p0f) && (list2 instanceof bue)) {
                bue bueVar = (bue) list2;
                if (!bueVar.zza()) {
                    list2 = bueVar.zza(list2.size() + size);
                    a5f.d(j, eseVar, list2);
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
        a5f.d(j, eseVar, list);
    }
}
