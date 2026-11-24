package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class wad extends AbstractSet {
    public final byte a;
    public final dq2 b;

    public wad(dq2 dq2Var, byte b) {
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
                Map n = dq2Var.n();
                if (n != null) {
                    return n.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int x = dq2Var.x(entry.getKey());
                    if (x != -1) {
                        Object[] objArr = dq2Var.e;
                        objArr.getClass();
                        if (u5f.a(objArr[x], entry.getValue())) {
                            return true;
                        }
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
                Map n = dq2Var.n();
                if (n != null) {
                    return n.entrySet().iterator();
                }
                return new lad(dq2Var, (byte) 1);
            default:
                Map n2 = dq2Var.n();
                if (n2 != null) {
                    return n2.keySet().iterator();
                }
                return new lad(dq2Var, (byte) 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                Map n = dq2Var.n();
                if (n != null) {
                    return n.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!dq2Var.t()) {
                        int w = dq2Var.w();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = dq2Var.b;
                        obj2.getClass();
                        int[] iArr = dq2Var.c;
                        iArr.getClass();
                        Object[] objArr = dq2Var.d;
                        objArr.getClass();
                        Object[] objArr2 = dq2Var.e;
                        objArr2.getClass();
                        int a = p1f.a(key, value, w, obj2, iArr, objArr, objArr2);
                        if (a != -1) {
                            dq2Var.r(a, w);
                            dq2Var.h--;
                            dq2Var.f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                Map n2 = dq2Var.n();
                if (n2 != null) {
                    return n2.keySet().remove(obj);
                }
                if (dq2Var.z(obj) != dq2.y) {
                    return true;
                }
                return false;
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
