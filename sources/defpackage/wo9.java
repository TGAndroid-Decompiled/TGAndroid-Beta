package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class wo9 implements Iterable {
    public to9 a;
    public to9 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo9.equals(java.lang.Object):boolean");
    }

    public to9 h(Object obj) {
        to9 to9Var = this.a;
        while (to9Var != null && !to9Var.a.equals(obj)) {
            to9Var = to9Var.c;
        }
        return to9Var;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            so9 so9Var = (so9) it;
            if (so9Var.hasNext()) {
                i += ((Map.Entry) so9Var.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    public Object i(Object obj) {
        to9 h = h(obj);
        if (h == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            for (vo9 vo9Var : weakHashMap.keySet()) {
                vo9Var.a(h);
            }
        }
        to9 to9Var = h.d;
        to9 to9Var2 = h.c;
        if (to9Var != null) {
            to9Var.c = to9Var2;
        } else {
            this.a = to9Var2;
        }
        to9 to9Var3 = h.c;
        if (to9Var3 != null) {
            to9Var3.d = to9Var;
        } else {
            this.b = to9Var;
        }
        h.c = null;
        h.d = null;
        return h.b;
    }

    @Override
    public final Iterator iterator() {
        so9 so9Var = new so9(this.a, this.b, (byte) 0);
        this.c.put(so9Var, Boolean.FALSE);
        return so9Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            so9 so9Var = (so9) it;
            if (so9Var.hasNext()) {
                sb.append(((Map.Entry) so9Var.next()).toString());
                if (so9Var.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
