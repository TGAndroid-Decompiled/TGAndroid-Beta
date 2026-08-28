package eb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import x5.l;
public final class c {
    public final HashMap f5106a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f5106a.containsKey(gb.b.class)) {
                Integer num = (Integer) hashMap.get(gb.b.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f5106a.put(gb.b.class, bVar.f5105a);
            hashMap.put(gb.b.class, 0);
        }
    }
}
