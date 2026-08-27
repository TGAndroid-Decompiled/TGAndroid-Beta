package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class f implements Iterable {

    public c f19084a;

    public c f19085b;

    public final WeakHashMap f19086c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.d != fVar.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    public c i(Object obj) {
        c cVar = this.f19084a;
        while (cVar != null && !cVar.f19078a.equals(obj)) {
            cVar = cVar.f19080c;
        }
        return cVar;
    }

    @Override
    public final Iterator iterator() {
        b bVar = new b(this.f19084a, this.f19085b, 0);
        this.f19086c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Object n(Object obj) {
        c cVarI = i(obj);
        if (cVarI == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f19086c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarI);
            }
        }
        c cVar = cVarI.d;
        if (cVar != null) {
            cVar.f19080c = cVarI.f19080c;
        } else {
            this.f19084a = cVarI.f19080c;
        }
        c cVar2 = cVarI.f19080c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f19085b = cVar;
        }
        cVarI.f19080c = null;
        cVarI.d = null;
        return cVarI.f19079b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
