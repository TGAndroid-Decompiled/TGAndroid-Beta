package ob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.telegram.messenger.g0;
public final class c {
    public final HashMap f20894a = new HashMap();

    public c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = this.f20894a;
            bVar.getClass();
            hashMap.put(a.class, bVar.f20893a);
        }
    }

    public void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.f20894a.remove(runnable);
        if (runnable2 != null) {
            g0.r(runnable2);
        }
    }

    public void b() {
        HashMap hashMap = this.f20894a;
        for (Map.Entry entry : hashMap.entrySet()) {
            g0.r((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public c() {
    }
}
