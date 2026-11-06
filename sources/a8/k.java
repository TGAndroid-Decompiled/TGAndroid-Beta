package a8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class k extends AbstractSet {
    public final int f498a;
    public final o f499b;

    public k(o oVar, int i7) {
        this.f498a = i7;
        this.f499b = oVar;
    }

    @Override
    public final void clear() {
        switch (this.f498a) {
            case 0:
                this.f499b.clear();
                return;
            default:
                this.f499b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f498a) {
            case 0:
                o oVar = this.f499b;
                Map b10 = oVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = oVar.f(entry.getKey());
                    if (f10 != -1) {
                        Object[] objArr = oVar.d;
                        objArr.getClass();
                        if (w0.a(objArr[f10], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f499b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f498a) {
            case 0:
                o oVar = this.f499b;
                Map b10 = oVar.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new j(oVar, 1);
            default:
                o oVar2 = this.f499b;
                Map b11 = oVar2.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new j(oVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f498a) {
            case 0:
                o oVar = this.f499b;
                Map b10 = oVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!oVar.d()) {
                        int e10 = oVar.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = oVar.f548a;
                        obj2.getClass();
                        int[] iArr = oVar.f549b;
                        iArr.getClass();
                        Object[] objArr = oVar.f550c;
                        objArr.getClass();
                        Object[] objArr2 = oVar.d;
                        objArr2.getClass();
                        int a10 = s0.a(key, value, e10, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            oVar.c(a10, e10);
                            oVar.f552f--;
                            oVar.f551e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                o oVar2 = this.f499b;
                Map b11 = oVar2.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (oVar2.h(obj) == o.f547s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f498a) {
            case 0:
                return this.f499b.size();
            default:
                return this.f499b.size();
        }
    }
}
