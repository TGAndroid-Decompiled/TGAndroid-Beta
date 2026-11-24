package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class ge3 {
    public final String a;
    public final sz4 b;

    public ge3(Set set, sz4 sz4Var) {
        this.a = b(set);
        this.b = sz4Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ya0 ya0Var = (ya0) it.next();
            sb.append(ya0Var.a);
            sb.append('/');
            sb.append(ya0Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        sz4 sz4Var = this.b;
        synchronized (((HashSet) sz4Var.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) sz4Var.a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(sz4Var.G());
    }
}
