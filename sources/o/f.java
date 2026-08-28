package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class f implements Iterable {
    public c f18742a;
    public c f18743b;
    public final WeakHashMap f18744c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: o.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i9 = 0;
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                i9 += ((Map.Entry) bVar.next()).hashCode();
            } else {
                return i9;
            }
        }
    }

    public c i(Object obj) {
        c cVar = this.f18742a;
        while (cVar != null && !cVar.f18736a.equals(obj)) {
            cVar = cVar.f18738c;
        }
        return cVar;
    }

    @Override
    public final Iterator iterator() {
        b bVar = new b(this.f18742a, this.f18743b, 0);
        this.f18744c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Object n(Object obj) {
        c i9 = i(obj);
        if (i9 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f18744c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(i9);
            }
        }
        c cVar = i9.d;
        if (cVar != null) {
            cVar.f18738c = i9.f18738c;
        } else {
            this.f18742a = i9.f18738c;
        }
        c cVar2 = i9.f18738c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f18743b = cVar;
        }
        i9.f18738c = null;
        i9.d = null;
        return i9.f18737b;
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
