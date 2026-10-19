package e9;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import v7.t6;
public final class u extends AbstractSet {
    public final int f8509a;
    public final x f8510b;

    public u(x xVar, int i10) {
        this.f8509a = i10;
        this.f8510b = xVar;
    }

    @Override
    public final void clear() {
        switch (this.f8509a) {
            case 0:
                this.f8510b.clear();
                return;
            default:
                this.f8510b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f8509a) {
            case 0:
                x xVar = this.f8510b;
                Map c10 = xVar.c();
                if (c10 != null) {
                    return c10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = xVar.e(entry.getKey());
                    if (e != -1 && t6.a(xVar.k()[e], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f8510b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f8509a) {
            case 0:
                x xVar = this.f8510b;
                Map c10 = xVar.c();
                if (c10 != null) {
                    return c10.entrySet().iterator();
                }
                return new t(xVar, 1);
            default:
                x xVar2 = this.f8510b;
                Map c11 = xVar2.c();
                if (c11 != null) {
                    return c11.keySet().iterator();
                }
                return new t(xVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f8509a) {
            case 0:
                x xVar = this.f8510b;
                Map c10 = xVar.c();
                if (c10 != null) {
                    return c10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!xVar.g()) {
                        int d = xVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = xVar.f8530a;
                        Objects.requireNonNull(obj2);
                        int r10 = s.r(key, value, d, obj2, xVar.i(), xVar.j(), xVar.k());
                        if (r10 != -1) {
                            xVar.f(r10, d);
                            xVar.f8533f--;
                            xVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                x xVar2 = this.f8510b;
                Map c11 = xVar2.c();
                if (c11 != null) {
                    return c11.keySet().remove(obj);
                }
                if (xVar2.h(obj) != x.f8529s) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int size() {
        switch (this.f8509a) {
            case 0:
                return this.f8510b.size();
            default:
                return this.f8510b.size();
        }
    }
}
