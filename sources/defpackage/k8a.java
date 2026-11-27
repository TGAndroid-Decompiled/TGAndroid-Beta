package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public abstract class k8a extends m8a {
    public static List a(f8a f8aVar) {
        f8aVar.getClass();
        Iterator it = f8aVar.iterator();
        if (!it.hasNext()) {
            return x24.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return tl2.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
