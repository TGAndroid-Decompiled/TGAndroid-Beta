package ja;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class b {
    public final String f9350a;
    public final c f9351b;

    public b(Set set, c cVar) {
        this.f9350a = b(set);
        this.f9351b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f9348a);
            sb.append('/');
            sb.append(aVar.f9349b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f9350a;
        c cVar = this.f9351b;
        synchronized (((HashSet) cVar.f9354b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f9354b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.o0());
    }
}
