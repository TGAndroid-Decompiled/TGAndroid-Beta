package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class fbd extends AbstractSet {
    public final byte a;
    public final lp2 b;

    public fbd(lp2 lp2Var, byte b) {
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
                Map m = lp2Var.m();
                if (m != null) {
                    return m.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int s = lp2Var.s(entry.getKey());
                    if (s != -1) {
                        Object[] objArr = lp2Var.e;
                        objArr.getClass();
                        if (e6f.a(objArr[s], entry.getValue())) {
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
                Map m = lp2Var.m();
                if (m != null) {
                    return m.entrySet().iterator();
                }
                return new mad(lp2Var, (byte) 1);
            default:
                Map m2 = lp2Var.m();
                if (m2 != null) {
                    return m2.keySet().iterator();
                }
                return new mad(lp2Var, (byte) 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                Map m = lp2Var.m();
                if (m != null) {
                    return m.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!lp2Var.p()) {
                        int q = lp2Var.q();
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
                        int a = b4f.a(key, value, q, obj2, iArr, objArr, objArr2);
                        if (a != -1) {
                            lp2Var.o(a, q);
                            lp2Var.h--;
                            lp2Var.f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                Map m2 = lp2Var.m();
                if (m2 != null) {
                    return m2.keySet().remove(obj);
                }
                if (lp2Var.v(obj) != lp2.x) {
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
