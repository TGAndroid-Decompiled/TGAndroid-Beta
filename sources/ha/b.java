package ha;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f7977a;
    public final c f7978b;

    public b(Set set, c cVar) {
        this.f7977a = b(set);
        this.f7978b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f7975a);
            sb2.append('/');
            sb2.append(aVar.f7976b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f7977a;
        c cVar = this.f7978b;
        synchronized (((HashSet) cVar.f7981b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f7981b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.b0());
    }
}
