package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class u8d extends AbstractSet {
    public final byte a;
    public final so2 b;

    public u8d(so2 so2Var, byte b) {
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
                Map n = so2Var.n();
                if (n != null) {
                    return n.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int x = so2Var.x(entry.getKey());
                    if (x != -1) {
                        Object[] objArr = so2Var.e;
                        objArr.getClass();
                        if (s3f.a(objArr[x], entry.getValue())) {
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
                Map n = so2Var.n();
                if (n != null) {
                    return n.entrySet().iterator();
                }
                return new j8d(so2Var, (byte) 1);
            default:
                Map n2 = so2Var.n();
                if (n2 != null) {
                    return n2.keySet().iterator();
                }
                return new j8d(so2Var, (byte) 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                Map n = so2Var.n();
                if (n != null) {
                    return n.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!so2Var.t()) {
                        int w = so2Var.w();
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
                        int a = nze.a(key, value, w, obj2, iArr, objArr, objArr2);
                        if (a != -1) {
                            so2Var.r(a, w);
                            so2Var.h--;
                            so2Var.f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                Map n2 = so2Var.n();
                if (n2 != null) {
                    return n2.keySet().remove(obj);
                }
                if (so2Var.z(obj) != so2.y) {
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
