package k7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class b extends AbstractSet {

    public final int f14498a;

    public final d f14499b;

    public b(d dVar, int i10) {
        this.f14498a = i10;
        this.f14499b = dVar;
    }

    @Override
    public final void clear() {
        switch (this.f14498a) {
            case 0:
                this.f14499b.clear();
                break;
            default:
                this.f14499b.clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f14498a) {
            case 0:
                d dVar = this.f14499b;
                Map mapA = dVar.a();
                if (mapA != null) {
                    return mapA.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = dVar.e(entry.getKey());
                    if (iE != -1) {
                        Object[] objArr = dVar.d;
                        objArr.getClass();
                        if (g7.x8.a(objArr[iE], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f14499b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f14498a) {
            case 0:
                d dVar = this.f14499b;
                Map mapA = dVar.a();
                return mapA != null ? mapA.entrySet().iterator() : new a(dVar, 1);
            default:
                d dVar2 = this.f14499b;
                Map mapA2 = dVar2.a();
                return mapA2 != null ? mapA2.keySet().iterator() : new a(dVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f14498a) {
            case 0:
                d dVar = this.f14499b;
                Map mapA = dVar.a();
                if (mapA != null) {
                    return mapA.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!dVar.c()) {
                        int iD = dVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = dVar.f14529a;
                        obj2.getClass();
                        int[] iArr = dVar.f14530b;
                        iArr.getClass();
                        Object[] objArr = dVar.f14531c;
                        objArr.getClass();
                        Object[] objArr2 = dVar.d;
                        objArr2.getClass();
                        int iA = g7.t8.a(key, value, iD, obj2, iArr, objArr, objArr2);
                        if (iA != -1) {
                            dVar.b(iA, iD);
                            dVar.f14533f--;
                            dVar.f14532e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.f14499b;
                Map mapA2 = dVar2.a();
                if (mapA2 != null) {
                    return mapA2.keySet().remove(obj);
                }
                return dVar2.g(obj) != d.f14528s;
        }
    }

    @Override
    public final int size() {
        switch (this.f14498a) {
            case 0:
                break;
        }
        return this.f14499b.size();
    }
}
