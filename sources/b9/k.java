package b9;

import java.util.Set;
public abstract class k extends g implements Set, j$.util.Set {
    public static final int f3705c = 0;
    public transient l f3706b;

    @Override
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (set.size() == 0) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
