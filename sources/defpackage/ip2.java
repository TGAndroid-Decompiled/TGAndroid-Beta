package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class ip2 extends AbstractSet {
    public final byte a;
    public final lp2 b;

    public ip2(lp2 lp2Var, byte b) {
        this.a = b;
        this.b = lp2Var;
    }

    @Override
    public final void clear() {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                lp2Var.clear();
                return;
            default:
                lp2Var.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                Map d = lp2Var.d();
                if (d != null) {
                    return d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = lp2Var.f(entry.getKey());
                    if (f != -1 && tue.a(lp2Var.l(f), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return lp2Var.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                Map d = lp2Var.d();
                if (d != null) {
                    return d.entrySet().iterator();
                }
                return new hp2(lp2Var, (byte) 1);
            default:
                Map d2 = lp2Var.d();
                if (d2 != null) {
                    return d2.keySet().iterator();
                }
                return new hp2(lp2Var, (byte) 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                Map d = lp2Var.d();
                if (d != null) {
                    return d.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (lp2Var.i()) {
                    return false;
                }
                int e = lp2Var.e();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = lp2Var.b;
                Objects.requireNonNull(obj2);
                int[] iArr = lp2Var.c;
                Objects.requireNonNull(iArr);
                Object[] objArr = lp2Var.d;
                Objects.requireNonNull(objArr);
                Object[] objArr2 = lp2Var.e;
                Objects.requireNonNull(objArr2);
                int c = twd.c(key, value, e, obj2, iArr, objArr, objArr2);
                if (c == -1) {
                    return false;
                }
                lp2Var.h(c, e);
                lp2Var.h--;
                lp2Var.f += 32;
                return true;
            default:
                Map d2 = lp2Var.d();
                if (d2 != null) {
                    return d2.keySet().remove(obj);
                }
                if (lp2Var.j(obj) == lp2.w) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                return lp2Var.size();
            default:
                return lp2Var.size();
        }
    }
}
