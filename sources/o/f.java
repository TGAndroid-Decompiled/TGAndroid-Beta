package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class f implements Iterable {
    public c f16145a;
    public c f16146b;
    public final WeakHashMap f16147c = new WeakHashMap();
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
        c cVar = this.f16145a;
        while (cVar != null && !cVar.f16139a.equals(obj)) {
            cVar = cVar.f16141c;
        }
        return cVar;
    }

    @Override
    public final Iterator iterator() {
        b bVar = new b(this.f16145a, this.f16146b, 0);
        this.f16147c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Object n(Object obj) {
        c i10 = i(obj);
        if (i10 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f16147c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(i10);
            }
        }
        c cVar = i10.d;
        if (cVar != null) {
            cVar.f16141c = i10.f16141c;
        } else {
            this.f16145a = i10.f16141c;
        }
        c cVar2 = i10.f16141c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f16146b = cVar;
        }
        i10.f16141c = null;
        i10.d = null;
        return i10.f16140b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                sb.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
