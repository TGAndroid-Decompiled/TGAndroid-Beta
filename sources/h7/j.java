package h7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class j extends AbstractSet {
    public final int f9966a;
    public final n f9967b;

    public j(n nVar, int i9) {
        this.f9966a = i9;
        this.f9967b = nVar;
    }

    @Override
    public final void clear() {
        switch (this.f9966a) {
            case 0:
                this.f9967b.clear();
                return;
            default:
                this.f9967b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f9966a) {
            case 0:
                n nVar = this.f9967b;
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
                        if (f7.a8.a(objArr[e10], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f9967b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f9966a) {
            case 0:
                n nVar = this.f9967b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new i(nVar, 1);
            default:
                n nVar2 = this.f9967b;
                Map a3 = nVar2.a();
                if (a3 != null) {
                    return a3.keySet().iterator();
                }
                return new i(nVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f9966a) {
            case 0:
                n nVar = this.f9967b;
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
                        Object obj2 = nVar.f10032a;
                        obj2.getClass();
                        int[] iArr = nVar.f10033b;
                        iArr.getClass();
                        Object[] objArr = nVar.f10034c;
                        objArr.getClass();
                        Object[] objArr2 = nVar.d;
                        objArr2.getClass();
                        int a3 = f7.w7.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a3 != -1) {
                            nVar.b(a3, d);
                            nVar.f10036f--;
                            nVar.f10035e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                n nVar2 = this.f9967b;
                Map a10 = nVar2.a();
                if (a10 != null) {
                    return a10.keySet().remove(obj);
                }
                if (nVar2.g(obj) == n.f10031s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f9966a) {
            case 0:
                return this.f9967b.size();
            default:
                return this.f9967b.size();
        }
    }
}
