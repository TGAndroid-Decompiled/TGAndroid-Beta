package j7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class j extends AbstractSet {
    public final int f11040a;
    public final n f11041b;

    public j(n nVar, int i10) {
        this.f11040a = i10;
        this.f11041b = nVar;
    }

    @Override
    public final void clear() {
        switch (this.f11040a) {
            case 0:
                this.f11041b.clear();
                return;
            default:
                this.f11041b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f11040a) {
            case 0:
                n nVar = this.f11041b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e10 = nVar.e(entry.getKey());
                    if (e10 != -1) {
                        Object[] objArr = nVar.d;
                        objArr.getClass();
                        if (h7.t8.a(objArr[e10], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f11041b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f11040a) {
            case 0:
                n nVar = this.f11041b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new i(nVar, 1);
            default:
                n nVar2 = this.f11041b;
                Map a10 = nVar2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new i(nVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f11040a) {
            case 0:
                n nVar = this.f11041b;
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
                        Object obj2 = nVar.f11112a;
                        obj2.getClass();
                        int[] iArr = nVar.f11113b;
                        iArr.getClass();
                        Object[] objArr = nVar.f11114c;
                        objArr.getClass();
                        Object[] objArr2 = nVar.d;
                        objArr2.getClass();
                        int a10 = h7.p8.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            nVar.b(a10, d);
                            nVar.f11116f--;
                            nVar.f11115e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                n nVar2 = this.f11041b;
                Map a11 = nVar2.a();
                if (a11 != null) {
                    return a11.keySet().remove(obj);
                }
                if (nVar2.g(obj) == n.f11111s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f11040a) {
            case 0:
                return this.f11041b.size();
            default:
                return this.f11041b.size();
        }
    }
}
