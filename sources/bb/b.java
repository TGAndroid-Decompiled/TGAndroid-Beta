package bb;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f3207a;
    public final c f3208b;

    public b(Set set, c cVar) {
        this.f3207a = b(set);
        this.f3208b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f3205a);
            sb2.append('/');
            sb2.append(aVar.f3206b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f3207a;
        c cVar = this.f3208b;
        synchronized (((HashSet) cVar.f3211b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f3211b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.c());
    }
}
