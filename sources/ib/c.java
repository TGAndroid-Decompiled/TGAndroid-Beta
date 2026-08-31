package ib;

import b6.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public final HashMap f8048a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f8048a.containsKey(kb.b.class)) {
                Integer num = (Integer) hashMap.get(kb.b.class);
                m.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f8048a.put(kb.b.class, bVar.f8047a);
            hashMap.put(kb.b.class, 0);
        }
    }
}
