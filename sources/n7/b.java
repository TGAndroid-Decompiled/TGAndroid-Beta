package n7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class b extends AbstractSet {
    public final int f15271a;
    public final d f15272b;

    public b(d dVar, int i10) {
        this.f15271a = i10;
        this.f15272b = dVar;
    }

    @Override
    public final void clear() {
        switch (this.f15271a) {
            case 0:
                this.f15272b.clear();
                return;
            default:
                this.f15272b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f15271a) {
            case 0:
                d dVar = this.f15272b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e6 = dVar.e(entry.getKey());
                    if (e6 != -1) {
                        Object[] objArr = dVar.d;
                        objArr.getClass();
                        if (k7.e0.a(objArr[e6], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f15272b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f15271a) {
            case 0:
                d dVar = this.f15272b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new a(dVar, 1);
            default:
                d dVar2 = this.f15272b;
                Map a10 = dVar2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new a(dVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f15271a) {
            case 0:
                d dVar = this.f15272b;
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
                        Object obj2 = dVar.f15303a;
                        obj2.getClass();
                        int[] iArr = dVar.f15304b;
                        iArr.getClass();
                        Object[] objArr = dVar.f15305c;
                        objArr.getClass();
                        Object[] objArr2 = dVar.d;
                        objArr2.getClass();
                        int a10 = k7.a0.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            dVar.b(a10, d);
                            dVar.f15307f--;
                            dVar.f15306e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.f15272b;
                Map a11 = dVar2.a();
                if (a11 != null) {
                    return a11.keySet().remove(obj);
                }
                if (dVar2.g(obj) == d.f15302s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f15271a) {
            case 0:
                return this.f15272b.size();
            default:
                return this.f15272b.size();
        }
    }
}
