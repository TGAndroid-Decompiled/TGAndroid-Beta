package cb;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f6034a;
    public final c f6035b;

    public b(Set set, c cVar) {
        this.f6034a = b(set);
        this.f6035b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f6032a);
            sb2.append('/');
            sb2.append(aVar.f6033b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f6034a;
        c cVar = this.f6035b;
        synchronized (((HashSet) cVar.f6038b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f6038b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.s());
    }
}
