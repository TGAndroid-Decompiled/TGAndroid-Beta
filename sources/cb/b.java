package cb;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f6039a;
    public final c f6040b;

    public b(Set set, c cVar) {
        this.f6039a = b(set);
        this.f6040b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f6037a);
            sb2.append('/');
            sb2.append(aVar.f6038b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f6039a;
        c cVar = this.f6040b;
        synchronized (((HashSet) cVar.f6043b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f6043b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.s());
    }
}
