package ja;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f9332a;
    public final c f9333b;

    public b(Set set, c cVar) {
        this.f9332a = b(set);
        this.f9333b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f9330a);
            sb.append('/');
            sb.append(aVar.f9331b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f9332a;
        c cVar = this.f9333b;
        synchronized (((HashSet) cVar.f9336b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f9336b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.k());
    }
}
