package g7;

import java.util.Iterator;
import java.util.Set;

public abstract class l9 extends h9 implements Set {

    public transient k9 f6552b;

    @Override
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public final k9 q() {
        k9 k9Var = this.f6552b;
        if (k9Var != null) {
            return k9Var;
        }
        n9 n9Var = new n9((a) this);
        this.f6552b = n9Var;
        return n9Var;
    }
}
