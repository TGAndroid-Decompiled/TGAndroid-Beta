package cb;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f4864a;
    public final c f4865b;

    public b(Set set, c cVar) {
        this.f4864a = b(set);
        this.f4865b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f4862a);
            sb2.append('/');
            sb2.append(aVar.f4863b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f4864a;
        c cVar = this.f4865b;
        synchronized (((HashSet) cVar.f4868b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f4868b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.q());
    }
}
