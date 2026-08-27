package fb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import y5.l;

public final class c {

    public final HashMap f6037a = new HashMap();

    public c(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.f6037a.containsKey(hb.b.class)) {
                Integer num = (Integer) map.get(hb.b.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.f6037a.put(hb.b.class, bVar.f6036a);
            map.put(hb.b.class, 0);
        }
    }
}
