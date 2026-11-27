package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class msd extends krd {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override
    public final void b(mnd mndVar, mnd mndVar2, long j) {
        ArrayList arrayList;
        List list = (List) k4e.l(j, mndVar2);
        int size = list.size();
        List list2 = (List) k4e.l(j, mndVar);
        if (list2.isEmpty()) {
            if (list2 instanceof frd) {
                list2 = new tqd(size);
            } else {
                list2 = new ArrayList(size);
            }
            k4e.d(j, mndVar, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                arrayList = arrayList2;
            } else if (list2 instanceof u3e) {
                u3e u3eVar = (u3e) list2;
                List tqdVar = new tqd(u3eVar.a.size() + size);
                tqdVar.addAll(u3eVar);
                arrayList = tqdVar;
            }
            k4e.d(j, mndVar, arrayList);
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
        k4e.d(j, mndVar, list);
    }
}
