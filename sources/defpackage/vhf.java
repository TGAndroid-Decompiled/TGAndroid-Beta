package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class vhf extends zhf {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override
    public final void b(Object obj, long j, Object obj2) {
        rhf rhfVar;
        List list = (List) hjf.g(obj2, j);
        int size = list.size();
        List list2 = (List) hjf.g(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof thf) {
                list2 = new rhf(size);
            } else if ((list2 instanceof qif) && (list2 instanceof ehf)) {
                list2 = ((ehf) list2).zzg(size);
            } else {
                list2 = new ArrayList(size);
            }
            hjf.i(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                hjf.i(obj, j, arrayList);
                rhfVar = arrayList;
            } else if (list2 instanceof fjf) {
                fjf fjfVar = (fjf) list2;
                rhf rhfVar2 = new rhf(fjfVar.size() + size);
                rhfVar2.addAll(rhfVar2.b.size(), fjfVar);
                hjf.i(obj, j, rhfVar2);
                rhfVar = rhfVar2;
            } else if ((list2 instanceof qif) && (list2 instanceof ehf)) {
                ehf ehfVar = (ehf) list2;
                if (!((mff) ehfVar).a) {
                    list2 = ehfVar.zzg(list2.size() + size);
                    hjf.i(obj, j, list2);
                }
            }
            list2 = rhfVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        hjf.i(obj, j, list);
    }
}
