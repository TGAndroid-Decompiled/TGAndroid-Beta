package fa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f6030a;
    public final c f6031b;

    public b(Set set, c cVar) {
        this.f6030a = b(set);
        this.f6031b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f6028a);
            sb2.append('/');
            sb2.append(aVar.f6029b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f6030a;
        c cVar = this.f6031b;
        synchronized (((HashSet) cVar.f6034b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f6034b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.I());
    }
}
