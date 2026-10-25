package a8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class c extends AbstractSet {
    public final int f379a;
    public final g f380b;

    public c(g gVar, int i10) {
        this.f379a = i10;
        this.f380b = gVar;
    }

    @Override
    public final void clear() {
        switch (this.f379a) {
            case 0:
                this.f380b.clear();
                return;
            default:
                this.f380b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f379a) {
            case 0:
                g gVar = this.f380b;
                Map a2 = gVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = gVar.e(entry.getKey());
                    if (e != -1) {
                        Object[] objArr = gVar.d;
                        objArr.getClass();
                        if (n0.a(objArr[e], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f380b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f379a) {
            case 0:
                g gVar = this.f380b;
                Map a2 = gVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new b(gVar, 1);
            default:
                g gVar2 = this.f380b;
                Map a10 = gVar2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new b(gVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f379a) {
            case 0:
                g gVar = this.f380b;
                Map a2 = gVar.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!gVar.c()) {
                        int d = gVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = gVar.f469a;
                        obj2.getClass();
                        int[] iArr = gVar.f470b;
                        iArr.getClass();
                        Object[] objArr = gVar.f471c;
                        objArr.getClass();
                        Object[] objArr2 = gVar.d;
                        objArr2.getClass();
                        int a10 = j0.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            gVar.b(a10, d);
                            gVar.f472f--;
                            gVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                g gVar2 = this.f380b;
                Map a11 = gVar2.a();
                if (a11 != null) {
                    return a11.keySet().remove(obj);
                }
                if (gVar2.g(obj) == g.f468s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f379a) {
            case 0:
                return this.f380b.size();
            default:
                return this.f380b.size();
        }
    }
}
