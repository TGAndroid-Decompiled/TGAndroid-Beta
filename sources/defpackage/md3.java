package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class md3 {
    public final String a;
    public final wz4 b;

    public md3(Set set, wz4 wz4Var) {
        this.a = b(set);
        this.b = wz4Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aa0 aa0Var = (aa0) it.next();
            sb.append(aa0Var.a);
            sb.append('/');
            sb.append(aa0Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        wz4 wz4Var = this.b;
        synchronized (((HashSet) wz4Var.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) wz4Var.a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(wz4Var.F());
    }
}
