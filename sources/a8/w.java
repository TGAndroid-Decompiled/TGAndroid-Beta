package a8;

import java.util.Set;
public abstract class w extends p implements Set {
    public transient u f690b;

    @Override
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
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

    @Override
    public final int hashCode() {
        int i7;
        int i10 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i10 += i7;
        }
        return i10;
    }
}
