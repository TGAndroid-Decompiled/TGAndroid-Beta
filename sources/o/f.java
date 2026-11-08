package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class f implements Iterable {
    public c f20670a;
    public c f20671b;
    public final WeakHashMap f20672c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: o.f.equals(java.lang.Object):boolean");
    }

    public c f(Object obj) {
        c cVar = this.f20670a;
        while (cVar != null && !cVar.f20664a.equals(obj)) {
            cVar = cVar.f20666c;
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
        WeakHashMap weakHashMap = this.f20672c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(f10);
            }
        }
        c cVar = f10.d;
        if (cVar != null) {
            cVar.f20666c = f10.f20666c;
        } else {
            this.f20670a = f10.f20666c;
        }
        c cVar2 = f10.f20666c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f20671b = cVar;
        }
        f10.f20666c = null;
        f10.d = null;
        return f10.f20665b;
    }

    @Override
    public final Iterator iterator() {
        b bVar = new b(this.f20670a, this.f20671b, 0);
        this.f20672c.put(bVar, Boolean.FALSE);
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
