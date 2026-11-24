package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public abstract class s4a extends u4a {
    public static List a(n4a n4aVar) {
        n4aVar.getClass();
        Iterator it = n4aVar.iterator();
        if (!it.hasNext()) {
            return c24.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zk2.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
