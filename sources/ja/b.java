package ja;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f9985a;
    public final c f9986b;

    public b(Set set, c cVar) {
        this.f9985a = b(set);
        this.f9986b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f9983a);
            sb.append('/');
            sb.append(aVar.f9984b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f9985a;
        c cVar = this.f9986b;
        synchronized (((HashSet) cVar.f9988a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f9988a);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.B());
    }
}
