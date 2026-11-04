package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class f implements Iterable {
    public c f20472a;
    public c f20473b;
    public final WeakHashMap f20474c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: o.f.equals(java.lang.Object):boolean");
    }

    public c h(Object obj) {
        c cVar = this.f20472a;
        while (cVar != null && !cVar.f20466a.equals(obj)) {
            cVar = cVar.f20468c;
        }
        return cVar;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                i3 += ((Map.Entry) bVar.next()).hashCode();
            } else {
                return i3;
            }
        }
    }

    public Object i(Object obj) {
        c h = h(obj);
        if (h == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f20474c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(h);
            }
        }
        c cVar = h.d;
        if (cVar != null) {
            cVar.f20468c = h.f20468c;
        } else {
            this.f20472a = h.f20468c;
        }
        c cVar2 = h.f20468c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f20473b = cVar;
        }
        h.f20468c = null;
        h.d = null;
        return h.f20467b;
    }

    @Override
    public final Iterator iterator() {
        b bVar = new b(this.f20472a, this.f20473b, 0);
        this.f20474c.put(bVar, Boolean.FALSE);
        return bVar;
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
