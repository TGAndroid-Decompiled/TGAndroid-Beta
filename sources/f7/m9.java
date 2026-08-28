package f7;

import java.util.Set;
public abstract class m9 extends i9 implements Set {
    public transient l9 f5755b;

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
        int i9;
        int i10 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i10 += i9;
        }
        return i10;
    }

    public final l9 q() {
        l9 l9Var = this.f5755b;
        if (l9Var == null) {
            o9 o9Var = new o9((a) this);
            this.f5755b = o9Var;
            return o9Var;
        }
        return l9Var;
    }
}
