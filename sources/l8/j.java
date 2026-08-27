package l8;

import java.util.Set;

public abstract class j extends f implements Set, j$.util.Set {

    public static final int f15476c = 0;

    public transient k f15477b;

    @Override
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return set.size() == 0 && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
