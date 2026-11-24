package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class m6d extends AbstractSet {
    public final byte a;
    public final so2 b;

    public m6d(so2 so2Var, byte b) {
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
                Map m = so2Var.m();
                if (m != null) {
                    return m.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int s = so2Var.s(entry.getKey());
                    if (s != -1) {
                        Object[] objArr = so2Var.e;
                        objArr.getClass();
                        if (m1f.a(objArr[s], entry.getValue())) {
                            return true;
                        }
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
                Map m = so2Var.m();
                if (m != null) {
                    return m.entrySet().iterator();
                }
                return new t5d(so2Var, (byte) 1);
            default:
                Map m2 = so2Var.m();
                if (m2 != null) {
                    return m2.keySet().iterator();
                }
                return new t5d(so2Var, (byte) 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                Map m = so2Var.m();
                if (m != null) {
                    return m.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!so2Var.p()) {
                        int q = so2Var.q();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = so2Var.b;
                        obj2.getClass();
                        int[] iArr = so2Var.c;
                        iArr.getClass();
                        Object[] objArr = so2Var.d;
                        objArr.getClass();
                        Object[] objArr2 = so2Var.e;
                        objArr2.getClass();
                        int a = gze.a(key, value, q, obj2, iArr, objArr, objArr2);
                        if (a != -1) {
                            so2Var.o(a, q);
                            so2Var.h--;
                            so2Var.f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                Map m2 = so2Var.m();
                if (m2 != null) {
                    return m2.keySet().remove(obj);
                }
                if (so2Var.v(obj) != so2.x) {
                    return true;
                }
                return false;
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
