package l7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class j extends AbstractSet {
    public final int f11881a;
    public final n f11882b;

    public j(n nVar, int i10) {
        this.f11881a = i10;
        this.f11882b = nVar;
    }

    @Override
    public final void clear() {
        switch (this.f11881a) {
            case 0:
                this.f11882b.clear();
                return;
            default:
                this.f11882b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f11881a) {
            case 0:
                n nVar = this.f11882b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e6 = nVar.e(entry.getKey());
                    if (e6 != -1) {
                        Object[] objArr = nVar.d;
                        objArr.getClass();
                        if (k7.j.a(objArr[e6], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f11882b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f11881a) {
            case 0:
                n nVar = this.f11882b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new i(nVar, 1);
            default:
                n nVar2 = this.f11882b;
                Map a10 = nVar2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new i(nVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f11881a) {
            case 0:
                n nVar = this.f11882b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!nVar.c()) {
                        int d = nVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = nVar.f11953a;
                        obj2.getClass();
                        int[] iArr = nVar.f11954b;
                        iArr.getClass();
                        Object[] objArr = nVar.f11955c;
                        objArr.getClass();
                        Object[] objArr2 = nVar.d;
                        objArr2.getClass();
                        int b10 = j7.g9.b(key, value, d, obj2, iArr, objArr, objArr2);
                        if (b10 != -1) {
                            nVar.b(b10, d);
                            nVar.f11957f--;
                            nVar.f11956e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                n nVar2 = this.f11882b;
                Map a10 = nVar2.a();
                if (a10 != null) {
                    return a10.keySet().remove(obj);
                }
                if (nVar2.g(obj) == n.f11952s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f11881a) {
            case 0:
                return this.f11882b.size();
            default:
                return this.f11882b.size();
        }
    }
}
