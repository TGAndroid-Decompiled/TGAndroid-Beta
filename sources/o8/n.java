package o8;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class n extends AbstractSet {
    public final int f19060a;
    public final p f19061b;

    public n(p pVar, int i9) {
        this.f19060a = i9;
        this.f19061b = pVar;
    }

    @Override
    public final void clear() {
        switch (this.f19060a) {
            case 0:
                this.f19061b.clear();
                return;
            default:
                this.f19061b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f19060a) {
            case 0:
                p pVar = this.f19061b;
                Map b10 = pVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = pVar.d(entry.getKey());
                    if (d != -1 && g7.c0.a(pVar.j()[d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f19061b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f19060a) {
            case 0:
                p pVar = this.f19061b;
                Map b10 = pVar.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new m(pVar, 1);
            default:
                p pVar2 = this.f19061b;
                Map b11 = pVar2.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new m(pVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f19060a) {
            case 0:
                p pVar = this.f19061b;
                Map b10 = pVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!pVar.f()) {
                        int c10 = pVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = pVar.f19069a;
                        Objects.requireNonNull(obj2);
                        int m10 = l.m(key, value, c10, obj2, pVar.h(), pVar.i(), pVar.j());
                        if (m10 != -1) {
                            pVar.e(m10, c10);
                            pVar.f19073f--;
                            pVar.f19072e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                p pVar2 = this.f19061b;
                Map b11 = pVar2.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (pVar2.g(obj) != p.f19068s) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int size() {
        switch (this.f19060a) {
            case 0:
                return this.f19061b.size();
            default:
                return this.f19061b.size();
        }
    }
}
