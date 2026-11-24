package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class ypd extends wod {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override
    public final void b(xkd xkdVar, xkd xkdVar2, long j) {
        ArrayList arrayList;
        List list = (List) x1e.l(xkdVar2, j);
        int size = list.size();
        List list2 = (List) x1e.l(xkdVar, j);
        if (list2.isEmpty()) {
            if (list2 instanceof rod) {
                list2 = new fod(size);
            } else {
                list2 = new ArrayList(size);
            }
            x1e.d(xkdVar, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                arrayList = arrayList2;
            } else if (list2 instanceof h1e) {
                h1e h1eVar = (h1e) list2;
                List fodVar = new fod(h1eVar.a.size() + size);
                fodVar.addAll(h1eVar);
                arrayList = fodVar;
            }
            x1e.d(xkdVar, j, arrayList);
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
        x1e.d(xkdVar, j, list);
    }
}
