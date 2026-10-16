package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class f implements Iterable {
    public c f16109a;
    public c f16110b;
    public final WeakHashMap f16111c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: o.f.equals(java.lang.Object):boolean");
    }

    public c h(Object obj) {
        c cVar = this.f16109a;
        while (cVar != null && !cVar.f16103a.equals(obj)) {
            cVar = cVar.f16105c;
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
        b bVar = new b(this.f16109a, this.f16110b, 0);
        this.f16111c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Object m(Object obj) {
        c h = h(obj);
        if (h == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f16111c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(h);
            }
        }
        c cVar = h.d;
        if (cVar != null) {
            cVar.f16105c = h.f16105c;
        } else {
            this.f16109a = h.f16105c;
        }
        c cVar2 = h.f16105c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f16110b = cVar;
        }
        h.f16105c = null;
        h.d = null;
        return h.f16104b;
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
