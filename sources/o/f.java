package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class f implements Iterable {
    public c f18918a;
    public c f18919b;
    public final WeakHashMap f18920c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: o.f.equals(java.lang.Object):boolean");
    }

    public c h(Object obj) {
        c cVar = this.f18918a;
        while (cVar != null && !cVar.f18912a.equals(obj)) {
            cVar = cVar.f18914c;
        }
        return cVar;
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
        b bVar = new b(this.f18918a, this.f18919b, 0);
        this.f18920c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Object m(Object obj) {
        c h = h(obj);
        if (h == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f18920c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(h);
            }
        }
        c cVar = h.d;
        if (cVar != null) {
            cVar.f18914c = h.f18914c;
        } else {
            this.f18918a = h.f18914c;
        }
        c cVar2 = h.f18914c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f18919b = cVar;
        }
        h.f18914c = null;
        h.d = null;
        return h.f18913b;
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
