package h7;

import java.util.Set;
public abstract class k9 extends g9 implements Set {
    public transient j9 f7684b;

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
        int i10;
        int i11 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    public final j9 q() {
        j9 j9Var = this.f7684b;
        if (j9Var == null) {
            m9 m9Var = new m9((a) this);
            this.f7684b = m9Var;
            return m9Var;
        }
        return j9Var;
    }
}
