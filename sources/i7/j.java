package i7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class j extends AbstractSet {

    public final int f10675a;

    public final n f10676b;

    public j(n nVar, int i10) {
        this.f10675a = i10;
        this.f10676b = nVar;
    }

    @Override
    public final void clear() {
        switch (this.f10675a) {
            case 0:
                this.f10676b.clear();
                break;
            default:
                this.f10676b.clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f10675a) {
            case 0:
                n nVar = this.f10676b;
                Map mapA = nVar.a();
                if (mapA != null) {
                    return mapA.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = nVar.e(entry.getKey());
                    if (iE != -1) {
                        Object[] objArr = nVar.d;
                        objArr.getClass();
                        if (g7.d8.a(objArr[iE], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f10676b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f10675a) {
            case 0:
                n nVar = this.f10676b;
                Map mapA = nVar.a();
                return mapA != null ? mapA.entrySet().iterator() : new i(nVar, 1);
            default:
                n nVar2 = this.f10676b;
                Map mapA2 = nVar2.a();
                return mapA2 != null ? mapA2.keySet().iterator() : new i(nVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f10675a) {
            case 0:
                n nVar = this.f10676b;
                Map mapA = nVar.a();
                if (mapA != null) {
                    return mapA.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!nVar.c()) {
                        int iD = nVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = nVar.f10741a;
                        obj2.getClass();
                        int[] iArr = nVar.f10742b;
                        iArr.getClass();
                        Object[] objArr = nVar.f10743c;
                        objArr.getClass();
                        Object[] objArr2 = nVar.d;
                        objArr2.getClass();
                        int iA = g7.z7.a(key, value, iD, obj2, iArr, objArr, objArr2);
                        if (iA != -1) {
                            nVar.b(iA, iD);
                            nVar.f10745f--;
                            nVar.f10744e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                n nVar2 = this.f10676b;
                Map mapA2 = nVar2.a();
                if (mapA2 != null) {
                    return mapA2.keySet().remove(obj);
                }
                return nVar2.g(obj) != n.f10740s;
        }
    }

    @Override
    public final int size() {
        switch (this.f10675a) {
            case 0:
                break;
        }
        return this.f10676b.size();
    }
}
