package ga;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b {

    public final String f6830a;

    public final c f6831b;

    public b(Set set, c cVar) {
        this.f6830a = b(set);
        this.f6831b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f6828a);
            sb2.append('/');
            sb2.append(aVar.f6829b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        String str = this.f6830a;
        c cVar = this.f6831b;
        synchronized (((HashSet) cVar.f6834b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f6834b);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.e());
    }
}
