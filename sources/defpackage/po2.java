package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class po2 extends AbstractSet {
    public final byte a;
    public final so2 b;

    public po2(so2 so2Var, byte b) {
        this.a = b;
        this.b = so2Var;
    }

    @Override
    public final void clear() {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                so2Var.clear();
                return;
            default:
                so2Var.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                Map d = so2Var.d();
                if (d != null) {
                    return d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = so2Var.f(entry.getKey());
                    if (f != -1 && bqe.a(so2Var.l(f), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return so2Var.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                Map d = so2Var.d();
                if (d != null) {
                    return d.entrySet().iterator();
                }
                return new oo2(so2Var, (byte) 1);
            default:
                Map d2 = so2Var.d();
                if (d2 != null) {
                    return d2.keySet().iterator();
                }
                return new oo2(so2Var, (byte) 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                Map d = so2Var.d();
                if (d != null) {
                    return d.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (so2Var.i()) {
                    return false;
                }
                int e = so2Var.e();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = so2Var.b;
                Objects.requireNonNull(obj2);
                int[] iArr = so2Var.c;
                Objects.requireNonNull(iArr);
                Object[] objArr = so2Var.d;
                Objects.requireNonNull(objArr);
                Object[] objArr2 = so2Var.e;
                Objects.requireNonNull(objArr2);
                int c = dsd.c(key, value, e, obj2, iArr, objArr, objArr2);
                if (c == -1) {
                    return false;
                }
                so2Var.h(c, e);
                so2Var.h--;
                so2Var.f += 32;
                return true;
            default:
                Map d2 = so2Var.d();
                if (d2 != null) {
                    return d2.keySet().remove(obj);
                }
                if (so2Var.j(obj) == so2.w) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                return so2Var.size();
            default:
                return so2Var.size();
        }
    }
}
