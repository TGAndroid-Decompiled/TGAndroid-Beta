package gd;

import i7.m7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import rc.o;
public abstract class d extends f {
    public static List a(b bVar) {
        j.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return o.f47121a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m7.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
