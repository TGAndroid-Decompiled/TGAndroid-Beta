package ib;

import b6.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public final HashMap f7476a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f7476a.containsKey(kb.b.class)) {
                Integer num = (Integer) hashMap.get(kb.b.class);
                m.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f7476a.put(kb.b.class, bVar.f7475a);
            hashMap.put(kb.b.class, 0);
        }
    }
}
