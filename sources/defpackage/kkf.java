package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class kkf extends okf {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override
    public final void b(long j, Object obj, Object obj2) {
        gkf gkfVar;
        List list = (List) wlf.g(obj2, j);
        int size = list.size();
        List list2 = (List) wlf.g(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof ikf) {
                list2 = new gkf(size);
            } else if ((list2 instanceof flf) && (list2 instanceof tjf)) {
                list2 = ((tjf) list2).zzg(size);
            } else {
                list2 = new ArrayList(size);
            }
            wlf.i(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                wlf.i(obj, j, arrayList);
                gkfVar = arrayList;
            } else if (list2 instanceof ulf) {
                ulf ulfVar = (ulf) list2;
                gkf gkfVar2 = new gkf(ulfVar.size() + size);
                gkfVar2.addAll(gkfVar2.b.size(), ulfVar);
                wlf.i(obj, j, gkfVar2);
                gkfVar = gkfVar2;
            } else if ((list2 instanceof flf) && (list2 instanceof tjf)) {
                tjf tjfVar = (tjf) list2;
                if (!((bif) tjfVar).a) {
                    list2 = tjfVar.zzg(list2.size() + size);
                    wlf.i(obj, j, list2);
                }
            }
            list2 = gkfVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        wlf.i(obj, j, list);
    }
}
