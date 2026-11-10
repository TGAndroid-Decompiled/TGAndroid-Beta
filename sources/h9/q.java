package h9;

import a8.ha;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class q extends AbstractSet {
    public final int f14370a;
    public final s f14371b;

    public q(s sVar, int i7) {
        this.f14370a = i7;
        this.f14371b = sVar;
    }

    @Override
    public final void clear() {
        switch (this.f14370a) {
            case 0:
                this.f14371b.clear();
                return;
            default:
                this.f14371b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f14370a) {
            case 0:
                s sVar = this.f14371b;
                Map d = sVar.d();
                if (d != null) {
                    return d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = sVar.f(entry.getKey());
                    if (f10 != -1 && ha.a(sVar.l()[f10], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f14371b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f14370a) {
            case 0:
                s sVar = this.f14371b;
                Map d = sVar.d();
                if (d != null) {
                    return d.entrySet().iterator();
                }
                return new p(sVar, 1);
            default:
                s sVar2 = this.f14371b;
                Map d2 = sVar2.d();
                if (d2 != null) {
                    return d2.keySet().iterator();
                }
                return new p(sVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f14370a) {
            case 0:
                s sVar = this.f14371b;
                Map d = sVar.d();
                if (d != null) {
                    return d.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!sVar.h()) {
                        int e10 = sVar.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = sVar.f14385a;
                        Objects.requireNonNull(obj2);
                        int s5 = o.s(key, value, e10, obj2, sVar.j(), sVar.k(), sVar.l());
                        if (s5 != -1) {
                            sVar.g(s5, e10);
                            sVar.f14389f--;
                            sVar.f14388e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                s sVar2 = this.f14371b;
                Map d2 = sVar2.d();
                if (d2 != null) {
                    return d2.keySet().remove(obj);
                }
                if (sVar2.i(obj) != s.f14384s) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int size() {
        switch (this.f14370a) {
            case 0:
                return this.f14371b.size();
            default:
                return this.f14371b.size();
        }
    }
}
