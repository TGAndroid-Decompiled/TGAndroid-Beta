package c8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class b extends AbstractSet {
    public final int f4515a;
    public final d f4516b;

    public b(d dVar, int i7) {
        this.f4515a = i7;
        this.f4516b = dVar;
    }

    @Override
    public final void clear() {
        switch (this.f4515a) {
            case 0:
                this.f4516b.clear();
                return;
            default:
                this.f4516b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f4515a) {
            case 0:
                d dVar = this.f4516b;
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
                return this.f4516b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f4515a) {
            case 0:
                d dVar = this.f4516b;
                Map b10 = dVar.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new a(dVar, 1);
            default:
                d dVar2 = this.f4516b;
                Map b11 = dVar2.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new a(dVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f4515a) {
            case 0:
                d dVar = this.f4516b;
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
                        Object obj2 = dVar.f4554a;
                        obj2.getClass();
                        int[] iArr = dVar.f4555b;
                        iArr.getClass();
                        Object[] objArr = dVar.f4556c;
                        objArr.getClass();
                        Object[] objArr2 = dVar.d;
                        objArr2.getClass();
                        int a10 = a8.w7.a(key, value, e10, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            dVar.c(a10, e10);
                            dVar.f4558f--;
                            dVar.f4557e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.f4516b;
                Map b11 = dVar2.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (dVar2.h(obj) == d.f4553s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f4515a) {
            case 0:
                return this.f4516b.size();
            default:
                return this.f4516b.size();
        }
    }
}
