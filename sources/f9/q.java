package f9;

import a8.xb;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class q extends AbstractSet {
    public final int f10325a;
    public final s f10326b;

    public q(s sVar, int i10) {
        this.f10325a = i10;
        this.f10326b = sVar;
    }

    @Override
    public final void clear() {
        switch (this.f10325a) {
            case 0:
                this.f10326b.clear();
                return;
            default:
                this.f10326b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f10325a) {
            case 0:
                s sVar = this.f10326b;
                Map c10 = sVar.c();
                if (c10 != null) {
                    return c10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = sVar.e(entry.getKey());
                    if (e != -1 && xb.a(sVar.k()[e], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f10326b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f10325a) {
            case 0:
                s sVar = this.f10326b;
                Map c10 = sVar.c();
                if (c10 != null) {
                    return c10.entrySet().iterator();
                }
                return new p(sVar, 1);
            default:
                s sVar2 = this.f10326b;
                Map c11 = sVar2.c();
                if (c11 != null) {
                    return c11.keySet().iterator();
                }
                return new p(sVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f10325a) {
            case 0:
                s sVar = this.f10326b;
                Map c10 = sVar.c();
                if (c10 != null) {
                    return c10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!sVar.g()) {
                        int d = sVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = sVar.f10336a;
                        Objects.requireNonNull(obj2);
                        int r6 = o.r(key, value, d, obj2, sVar.i(), sVar.j(), sVar.k());
                        if (r6 != -1) {
                            sVar.f(r6, d);
                            sVar.f10339f--;
                            sVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                s sVar2 = this.f10326b;
                Map c11 = sVar2.c();
                if (c11 != null) {
                    return c11.keySet().remove(obj);
                }
                if (sVar2.h(obj) != s.f10335s) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int size() {
        switch (this.f10325a) {
            case 0:
                return this.f10326b.size();
            default:
                return this.f10326b.size();
        }
    }
}
