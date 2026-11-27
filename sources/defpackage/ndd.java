package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class ndd extends AbstractSet {
    public final byte a;
    public final lp2 b;

    public ndd(lp2 lp2Var, byte b) {
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
                Map n = lp2Var.n();
                if (n != null) {
                    return n.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int x = lp2Var.x(entry.getKey());
                    if (x != -1) {
                        Object[] objArr = lp2Var.e;
                        objArr.getClass();
                        if (l8f.a(objArr[x], entry.getValue())) {
                            return true;
                        }
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
                Map n = lp2Var.n();
                if (n != null) {
                    return n.entrySet().iterator();
                }
                return new cdd(lp2Var, (byte) 1);
            default:
                Map n2 = lp2Var.n();
                if (n2 != null) {
                    return n2.keySet().iterator();
                }
                return new cdd(lp2Var, (byte) 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                Map n = lp2Var.n();
                if (n != null) {
                    return n.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!lp2Var.t()) {
                        int w = lp2Var.w();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = lp2Var.b;
                        obj2.getClass();
                        int[] iArr = lp2Var.c;
                        iArr.getClass();
                        Object[] objArr = lp2Var.d;
                        objArr.getClass();
                        Object[] objArr2 = lp2Var.e;
                        objArr2.getClass();
                        int a = f4f.a(key, value, w, obj2, iArr, objArr, objArr2);
                        if (a != -1) {
                            lp2Var.r(a, w);
                            lp2Var.h--;
                            lp2Var.f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                Map n2 = lp2Var.n();
                if (n2 != null) {
                    return n2.keySet().remove(obj);
                }
                if (lp2Var.z(obj) != lp2.y) {
                    return true;
                }
                return false;
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
