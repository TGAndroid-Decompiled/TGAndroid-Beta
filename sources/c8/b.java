package c8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class b extends AbstractSet {
    public final int f4489a;
    public final d f4490b;

    public b(d dVar, int i7) {
        this.f4489a = i7;
        this.f4490b = dVar;
    }

    @Override
    public final void clear() {
        switch (this.f4489a) {
            case 0:
                this.f4490b.clear();
                return;
            default:
                this.f4490b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f4489a) {
            case 0:
                d dVar = this.f4490b;
                Map b10 = dVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = dVar.f(entry.getKey());
                    if (f10 != -1) {
                        Object[] objArr = dVar.d;
                        objArr.getClass();
                        if (a8.f8.a(objArr[f10], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f4490b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f4489a) {
            case 0:
                d dVar = this.f4490b;
                Map b10 = dVar.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new a(dVar, 1);
            default:
                d dVar2 = this.f4490b;
                Map b11 = dVar2.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new a(dVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f4489a) {
            case 0:
                d dVar = this.f4490b;
                Map b10 = dVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!dVar.d()) {
                        int e10 = dVar.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = dVar.f4528a;
                        obj2.getClass();
                        int[] iArr = dVar.f4529b;
                        iArr.getClass();
                        Object[] objArr = dVar.f4530c;
                        objArr.getClass();
                        Object[] objArr2 = dVar.d;
                        objArr2.getClass();
                        int a10 = a8.w7.a(key, value, e10, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            dVar.c(a10, e10);
                            dVar.f4532f--;
                            dVar.f4531e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.f4490b;
                Map b11 = dVar2.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (dVar2.h(obj) == d.f4527s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f4489a) {
            case 0:
                return this.f4490b.size();
            default:
                return this.f4490b.size();
        }
    }
}
