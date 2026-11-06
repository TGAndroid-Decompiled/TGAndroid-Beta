package c8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class b extends AbstractSet {
    public final int f5381a;
    public final d f5382b;

    public b(d dVar, int i7) {
        this.f5381a = i7;
        this.f5382b = dVar;
    }

    @Override
    public final void clear() {
        switch (this.f5381a) {
            case 0:
                this.f5382b.clear();
                return;
            default:
                this.f5382b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f5381a) {
            case 0:
                d dVar = this.f5382b;
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
                        if (a8.e8.a(objArr[f10], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f5382b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f5381a) {
            case 0:
                d dVar = this.f5382b;
                Map b10 = dVar.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new a(dVar, 1);
            default:
                d dVar2 = this.f5382b;
                Map b11 = dVar2.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new a(dVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f5381a) {
            case 0:
                d dVar = this.f5382b;
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
                        Object obj2 = dVar.f5414a;
                        obj2.getClass();
                        int[] iArr = dVar.f5415b;
                        iArr.getClass();
                        Object[] objArr = dVar.f5416c;
                        objArr.getClass();
                        Object[] objArr2 = dVar.d;
                        objArr2.getClass();
                        int a10 = a8.v7.a(key, value, e10, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            dVar.c(a10, e10);
                            dVar.f5418f--;
                            dVar.f5417e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.f5382b;
                Map b11 = dVar2.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (dVar2.h(obj) == d.f5413s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f5381a) {
            case 0:
                return this.f5382b.size();
            default:
                return this.f5382b.size();
        }
    }
}
