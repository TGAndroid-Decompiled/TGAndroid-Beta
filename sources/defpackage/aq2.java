package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class aq2 extends AbstractSet {
    public final byte a;
    public final dq2 b;

    public aq2(dq2 dq2Var, byte b) {
        this.a = b;
        this.b = dq2Var;
    }

    @Override
    public final void clear() {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                dq2Var.clear();
                return;
            default:
                dq2Var.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                Map d = dq2Var.d();
                if (d != null) {
                    return d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = dq2Var.f(entry.getKey());
                    if (f != -1 && ese.a(dq2Var.l(f), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return dq2Var.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                Map d = dq2Var.d();
                if (d != null) {
                    return d.entrySet().iterator();
                }
                return new zp2(dq2Var, (byte) 1);
            default:
                Map d2 = dq2Var.d();
                if (d2 != null) {
                    return d2.keySet().iterator();
                }
                return new zp2(dq2Var, (byte) 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                Map d = dq2Var.d();
                if (d != null) {
                    return d.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (dq2Var.i()) {
                    return false;
                }
                int e = dq2Var.e();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = dq2Var.b;
                Objects.requireNonNull(obj2);
                int[] iArr = dq2Var.c;
                Objects.requireNonNull(iArr);
                Object[] objArr = dq2Var.d;
                Objects.requireNonNull(objArr);
                Object[] objArr2 = dq2Var.e;
                Objects.requireNonNull(objArr2);
                int c = gud.c(key, value, e, obj2, iArr, objArr, objArr2);
                if (c == -1) {
                    return false;
                }
                dq2Var.h(c, e);
                dq2Var.h--;
                dq2Var.f += 32;
                return true;
            default:
                Map d2 = dq2Var.d();
                if (d2 != null) {
                    return d2.keySet().remove(obj);
                }
                if (dq2Var.j(obj) == dq2.w) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                return dq2Var.size();
            default:
                return dq2Var.size();
        }
    }
}
