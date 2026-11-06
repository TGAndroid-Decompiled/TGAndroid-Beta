package cb;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f6036a;
    public final c f6037b;

    public b(Set set, c cVar) {
        this.f6036a = b(set);
        this.f6037b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f6034a);
            sb2.append('/');
            sb2.append(aVar.f6035b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f6036a;
        c cVar = this.f6037b;
        synchronized (((HashSet) cVar.f6040b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f6040b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.s());
    }
}
