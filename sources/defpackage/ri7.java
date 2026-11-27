package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public final class ri7 {
    public final HashMap a = new HashMap();

    public ri7(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            qi7 qi7Var = (qi7) it.next();
            qi7Var.getClass();
            if (this.a.containsKey(lm5.class)) {
                Integer num = (Integer) hashMap.get(lm5.class);
                xve.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(lm5.class, qi7Var.a);
            hashMap.put(lm5.class, 0);
        }
    }
}
