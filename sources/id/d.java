package id;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7.t7;
import kotlin.jvm.internal.j;
import tc.o;
public abstract class d extends f {
    public static List a(b bVar) {
        j.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return o.f48064a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return t7.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
