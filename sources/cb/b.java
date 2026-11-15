package cb;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f4861a;
    public final c f4862b;

    public b(Set set, c cVar) {
        this.f4861a = b(set);
        this.f4862b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f4859a);
            sb2.append('/');
            sb2.append(aVar.f4860b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f4861a;
        c cVar = this.f4862b;
        synchronized (((HashSet) cVar.f4865b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f4865b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.q());
    }
}
