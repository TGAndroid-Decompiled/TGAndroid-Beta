package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class f implements Iterable {
    public c f21583a;
    public c f21584b;
    public final WeakHashMap f21585c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: o.f.equals(java.lang.Object):boolean");
    }

    public c f(Object obj) {
        c cVar = this.f21583a;
        while (cVar != null && !cVar.f21577a.equals(obj)) {
            cVar = cVar.f21579c;
        }
        return cVar;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                i7 += ((Map.Entry) bVar.next()).hashCode();
            } else {
                return i7;
            }
        }
    }

    public Object i(Object obj) {
        c f10 = f(obj);
        if (f10 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f21585c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(f10);
            }
        }
        c cVar = f10.d;
        if (cVar != null) {
            cVar.f21579c = f10.f21579c;
        } else {
            this.f21583a = f10.f21579c;
        }
        c cVar2 = f10.f21579c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f21584b = cVar;
        }
        f10.f21579c = null;
        f10.d = null;
        return f10.f21578b;
    }

    @Override
    public final Iterator iterator() {
        b bVar = new b(this.f21583a, this.f21584b, 0);
        this.f21585c.put(bVar, Boolean.FALSE);
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
