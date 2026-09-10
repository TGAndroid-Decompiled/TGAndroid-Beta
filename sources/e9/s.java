package e9;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import v7.s6;
public final class s extends AbstractSet {
    public final int f7423a;
    public final v f7424b;

    public s(v vVar, int i10) {
        this.f7423a = i10;
        this.f7424b = vVar;
    }

    @Override
    public final void clear() {
        switch (this.f7423a) {
            case 0:
                this.f7424b.clear();
                return;
            default:
                this.f7424b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f7423a) {
            case 0:
                v vVar = this.f7424b;
                Map b10 = vVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = vVar.d(entry.getKey());
                    if (d != -1 && s6.a(vVar.j()[d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f7424b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7423a) {
            case 0:
                v vVar = this.f7424b;
                Map b10 = vVar.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new r(vVar, 1);
            default:
                v vVar2 = this.f7424b;
                Map b11 = vVar2.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new r(vVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f7423a) {
            case 0:
                v vVar = this.f7424b;
                Map b10 = vVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!vVar.f()) {
                        int c10 = vVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = vVar.f7435a;
                        Objects.requireNonNull(obj2);
                        int q6 = q.q(key, value, c10, obj2, vVar.h(), vVar.i(), vVar.j());
                        if (q6 != -1) {
                            vVar.e(q6, c10);
                            vVar.f7438f--;
                            vVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                v vVar2 = this.f7424b;
                Map b11 = vVar2.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (vVar2.g(obj) != v.f7434s) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int size() {
        switch (this.f7423a) {
            case 0:
                return this.f7424b.size();
            default:
                return this.f7424b.size();
        }
    }
}
