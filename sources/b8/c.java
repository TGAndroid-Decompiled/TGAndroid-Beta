package b8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class c extends AbstractSet {
    public final int f2494a;
    public final g f2495b;

    public c(g gVar, int i3) {
        this.f2494a = i3;
        this.f2495b = gVar;
    }

    @Override
    public final void clear() {
        switch (this.f2494a) {
            case 0:
                this.f2495b.clear();
                return;
            default:
                this.f2495b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f2494a) {
            case 0:
                g gVar = this.f2495b;
                Map b10 = gVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = gVar.f(entry.getKey());
                    if (f10 != -1) {
                        Object[] objArr = gVar.d;
                        objArr.getClass();
                        if (m1.a(objArr[f10], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f2495b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f2494a) {
            case 0:
                g gVar = this.f2495b;
                Map b10 = gVar.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new b(gVar, 1);
            default:
                g gVar2 = this.f2495b;
                Map b11 = gVar2.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new b(gVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f2494a) {
            case 0:
                g gVar = this.f2495b;
                Map b10 = gVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!gVar.d()) {
                        int e10 = gVar.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = gVar.f2612a;
                        obj2.getClass();
                        int[] iArr = gVar.f2613b;
                        iArr.getClass();
                        Object[] objArr = gVar.f2614c;
                        objArr.getClass();
                        Object[] objArr2 = gVar.d;
                        objArr2.getClass();
                        int a10 = i1.a(key, value, e10, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            gVar.c(a10, e10);
                            gVar.f2616f--;
                            gVar.f2615e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                g gVar2 = this.f2495b;
                Map b11 = gVar2.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (gVar2.h(obj) == g.f2611s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f2494a) {
            case 0:
                return this.f2495b.size();
            default:
                return this.f2495b.size();
        }
    }
}
