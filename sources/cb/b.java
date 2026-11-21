package cb;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f5176a;
    public final c f5177b;

    public b(Set set, c cVar) {
        this.f5176a = b(set);
        this.f5177b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f5174a);
            sb2.append('/');
            sb2.append(aVar.f5175b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f5176a;
        c cVar = this.f5177b;
        synchronized (((HashSet) cVar.f5180b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f5180b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.l());
    }
}
