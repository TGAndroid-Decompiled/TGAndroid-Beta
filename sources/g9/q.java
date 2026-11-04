package g9;

import b8.yb;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class q extends AbstractSet {
    public final int f12126a;
    public final s f12127b;

    public q(s sVar, int i3) {
        this.f12126a = i3;
        this.f12127b = sVar;
    }

    @Override
    public final void clear() {
        switch (this.f12126a) {
            case 0:
                this.f12127b.clear();
                return;
            default:
                this.f12127b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f12126a) {
            case 0:
                s sVar = this.f12127b;
                Map d = sVar.d();
                if (d != null) {
                    return d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = sVar.f(entry.getKey());
                    if (f10 != -1 && yb.a(sVar.l()[f10], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f12127b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f12126a) {
            case 0:
                s sVar = this.f12127b;
                Map d = sVar.d();
                if (d != null) {
                    return d.entrySet().iterator();
                }
                return new p(sVar, 1);
            default:
                s sVar2 = this.f12127b;
                Map d10 = sVar2.d();
                if (d10 != null) {
                    return d10.keySet().iterator();
                }
                return new p(sVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f12126a) {
            case 0:
                s sVar = this.f12127b;
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
                        Object obj2 = sVar.f12139a;
                        Objects.requireNonNull(obj2);
                        int s6 = o.s(key, value, e10, obj2, sVar.j(), sVar.k(), sVar.l());
                        if (s6 != -1) {
                            sVar.g(s6, e10);
                            sVar.f12143f--;
                            sVar.f12142e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                s sVar2 = this.f12127b;
                Map d10 = sVar2.d();
                if (d10 != null) {
                    return d10.keySet().remove(obj);
                }
                if (sVar2.i(obj) != s.f12138s) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int size() {
        switch (this.f12126a) {
            case 0:
                return this.f12127b.size();
            default:
                return this.f12127b.size();
        }
    }
}
