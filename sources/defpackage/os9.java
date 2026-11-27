package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
public class os9 implements Iterable {
    public ls9 a;
    public ls9 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final boolean equals(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os9.equals(java.lang.Object):boolean");
    }

    public ls9 h(Object obj) {
        ls9 ls9Var = this.a;
        while (ls9Var != null && !ls9Var.a.equals(obj)) {
            ls9Var = ls9Var.c;
        }
        return ls9Var;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            ks9 ks9Var = (ks9) it;
            if (ks9Var.hasNext()) {
                i += ((Map.Entry) ks9Var.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    public Object i(Object obj) {
        ls9 h = h(obj);
        if (h == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            for (ns9 ns9Var : weakHashMap.keySet()) {
                ns9Var.a(h);
            }
        }
        ls9 ls9Var = h.d;
        ls9 ls9Var2 = h.c;
        if (ls9Var != null) {
            ls9Var.c = ls9Var2;
        } else {
            this.a = ls9Var2;
        }
        ls9 ls9Var3 = h.c;
        if (ls9Var3 != null) {
            ls9Var3.d = ls9Var;
        } else {
            this.b = ls9Var;
        }
        h.c = null;
        h.d = null;
        return h.b;
    }

    @Override
    public final Iterator iterator() {
        ks9 ks9Var = new ks9(this.a, this.b, (byte) 0);
        this.c.put(ks9Var, Boolean.FALSE);
        return ks9Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ks9 ks9Var = (ks9) it;
            if (ks9Var.hasNext()) {
                sb.append(((Map.Entry) ks9Var.next()).toString());
                if (ks9Var.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
