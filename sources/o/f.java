package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class f implements Iterable {
    public c f16928a;
    public c f16929b;
    public final WeakHashMap f16930c = new WeakHashMap();
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

    public c i(Object obj) {
        c cVar = this.f16928a;
        while (cVar != null && !cVar.f16922a.equals(obj)) {
            cVar = cVar.f16924c;
        }
        return cVar;
    }

    @Override
    public final Iterator iterator() {
        b bVar = new b(this.f16928a, this.f16929b, 0);
        this.f16930c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Object n(Object obj) {
        c i10 = i(obj);
        if (i10 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f16930c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(i10);
            }
        }
        c cVar = i10.d;
        if (cVar != null) {
            cVar.f16924c = i10.f16924c;
        } else {
            this.f16928a = i10.f16924c;
        }
        c cVar2 = i10.f16924c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f16929b = cVar;
        }
        i10.f16924c = null;
        i10.d = null;
        return i10.f16923b;
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
