package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public abstract class u6a extends w6a {
    public static List a(p6a p6aVar) {
        p6aVar.getClass();
        Iterator it = p6aVar.iterator();
        if (!it.hasNext()) {
            return n34.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return lm2.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
