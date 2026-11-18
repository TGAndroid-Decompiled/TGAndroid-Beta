package cb;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f5147a;
    public final c f5148b;

    public b(Set set, c cVar) {
        this.f5147a = b(set);
        this.f5148b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f5145a);
            sb2.append('/');
            sb2.append(aVar.f5146b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f5147a;
        c cVar = this.f5148b;
        synchronized (((HashSet) cVar.f5151b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f5151b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.l());
    }
}
