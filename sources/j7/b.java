package j7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class b extends AbstractSet {
    public final int f13644a;
    public final d f13645b;

    public b(d dVar, int i9) {
        this.f13644a = i9;
        this.f13645b = dVar;
    }

    @Override
    public final void clear() {
        switch (this.f13644a) {
            case 0:
                this.f13645b.clear();
                return;
            default:
                this.f13645b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f13644a) {
            case 0:
                d dVar = this.f13645b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e10 = dVar.e(entry.getKey());
                    if (e10 != -1) {
                        Object[] objArr = dVar.d;
                        objArr.getClass();
                        if (f7.x8.a(objArr[e10], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f13645b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f13644a) {
            case 0:
                d dVar = this.f13645b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new a(dVar, 1);
            default:
                d dVar2 = this.f13645b;
                Map a3 = dVar2.a();
                if (a3 != null) {
                    return a3.keySet().iterator();
                }
                return new a(dVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f13644a) {
            case 0:
                d dVar = this.f13645b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!dVar.c()) {
                        int d = dVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = dVar.f13675a;
                        obj2.getClass();
                        int[] iArr = dVar.f13676b;
                        iArr.getClass();
                        Object[] objArr = dVar.f13677c;
                        objArr.getClass();
                        Object[] objArr2 = dVar.d;
                        objArr2.getClass();
                        int a3 = f7.t8.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a3 != -1) {
                            dVar.b(a3, d);
                            dVar.f13679f--;
                            dVar.f13678e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.f13645b;
                Map a10 = dVar2.a();
                if (a10 != null) {
                    return a10.keySet().remove(obj);
                }
                if (dVar2.g(obj) == d.f13674s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f13644a) {
            case 0:
                return this.f13645b.size();
            default:
                return this.f13645b.size();
        }
    }
}
