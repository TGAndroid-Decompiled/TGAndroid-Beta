package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class f implements Iterable {
    public c f13906a;
    public c f13907b;
    public final WeakHashMap f13908c = new WeakHashMap();
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
        b bVar = new b(this.f13906a, this.f13907b, 0);
        this.f13908c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public c l(Object obj) {
        c cVar = this.f13906a;
        while (cVar != null && !cVar.f13900a.equals(obj)) {
            cVar = cVar.f13902c;
        }
        return cVar;
    }

    public Object m(Object obj) {
        c l4 = l(obj);
        if (l4 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f13908c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(l4);
            }
        }
        c cVar = l4.d;
        if (cVar != null) {
            cVar.f13902c = l4.f13902c;
        } else {
            this.f13906a = l4.f13902c;
        }
        c cVar2 = l4.f13902c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f13907b = cVar;
        }
        l4.f13902c = null;
        l4.d = null;
        return l4.f13901b;
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
