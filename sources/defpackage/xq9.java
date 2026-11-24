package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class xq9 implements Iterable {
    public uq9 a;
    public uq9 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq9.equals(java.lang.Object):boolean");
    }

    public uq9 h(Object obj) {
        uq9 uq9Var = this.a;
        while (uq9Var != null && !uq9Var.a.equals(obj)) {
            uq9Var = uq9Var.c;
        }
        return uq9Var;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            tq9 tq9Var = (tq9) it;
            if (tq9Var.hasNext()) {
                i += ((Map.Entry) tq9Var.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    public Object i(Object obj) {
        uq9 h = h(obj);
        if (h == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            for (wq9 wq9Var : weakHashMap.keySet()) {
                wq9Var.a(h);
            }
        }
        uq9 uq9Var = h.d;
        uq9 uq9Var2 = h.c;
        if (uq9Var != null) {
            uq9Var.c = uq9Var2;
        } else {
            this.a = uq9Var2;
        }
        uq9 uq9Var3 = h.c;
        if (uq9Var3 != null) {
            uq9Var3.d = uq9Var;
        } else {
            this.b = uq9Var;
        }
        h.c = null;
        h.d = null;
        return h.b;
    }

    @Override
    public final Iterator iterator() {
        tq9 tq9Var = new tq9(this.a, this.b, (byte) 0);
        this.c.put(tq9Var, Boolean.FALSE);
        return tq9Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            tq9 tq9Var = (tq9) it;
            if (tq9Var.hasNext()) {
                sb.append(((Map.Entry) tq9Var.next()).toString());
                if (tq9Var.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
