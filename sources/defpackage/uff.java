package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class uff extends yff {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override
    public final void b(Object obj, long j, Object obj2) {
        qff qffVar;
        List list = (List) ghf.g(obj2, j);
        int size = list.size();
        List list2 = (List) ghf.g(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof sff) {
                list2 = new qff(size);
            } else if ((list2 instanceof pgf) && (list2 instanceof dff)) {
                list2 = ((dff) list2).zzg(size);
            } else {
                list2 = new ArrayList(size);
            }
            ghf.i(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                ghf.i(obj, j, arrayList);
                qffVar = arrayList;
            } else if (list2 instanceof ehf) {
                ehf ehfVar = (ehf) list2;
                qff qffVar2 = new qff(ehfVar.size() + size);
                qffVar2.addAll(qffVar2.b.size(), ehfVar);
                ghf.i(obj, j, qffVar2);
                qffVar = qffVar2;
            } else if ((list2 instanceof pgf) && (list2 instanceof dff)) {
                dff dffVar = (dff) list2;
                if (!((ldf) dffVar).a) {
                    list2 = dffVar.zzg(list2.size() + size);
                    ghf.i(obj, j, list2);
                }
            }
            list2 = qffVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        ghf.i(obj, j, list);
    }
}
