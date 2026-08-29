package gb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import z5.l;
public final class c {
    public final HashMap f7262a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f7262a.containsKey(ib.b.class)) {
                Integer num = (Integer) hashMap.get(ib.b.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f7262a.put(ib.b.class, bVar.f7261a);
            hashMap.put(ib.b.class, 0);
        }
    }
}
