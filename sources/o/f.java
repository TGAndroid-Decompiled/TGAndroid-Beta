package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class f implements Iterable {
    public c f13907a;
    public c f13908b;
    public final WeakHashMap f13909c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: o.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                i10 += ((Map.Entry) bVar.next()).hashCode();
            } else {
                return i10;
            }
        }
    }

    @Override
    public final Iterator iterator() {
        b bVar = new b(this.f13907a, this.f13908b, 0);
        this.f13909c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public c l(Object obj) {
        c cVar = this.f13907a;
        while (cVar != null && !cVar.f13901a.equals(obj)) {
            cVar = cVar.f13903c;
        }
        return cVar;
    }

    public Object m(Object obj) {
        c l4 = l(obj);
        if (l4 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f13909c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(l4);
            }
        }
        c cVar = l4.d;
        if (cVar != null) {
            cVar.f13903c = l4.f13903c;
        } else {
            this.f13907a = l4.f13903c;
        }
        c cVar2 = l4.f13903c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f13908b = cVar;
        }
        l4.f13903c = null;
        l4.d = null;
        return l4.f13902b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                sb2.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
