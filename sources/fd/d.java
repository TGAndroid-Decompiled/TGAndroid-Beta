package fd;

import h7.q6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import qc.o;

public abstract class d extends f {
    public static List a(b bVar) {
        j.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return o.f46210a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q6.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
