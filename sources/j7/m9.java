package j7;

import java.util.Set;
public abstract class m9 extends i9 implements Set {
    public transient l9 f9706b;

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

    public final l9 q() {
        l9 l9Var = this.f9706b;
        if (l9Var == null) {
            o9 o9Var = new o9((a) this);
            this.f9706b = o9Var;
            return o9Var;
        }
        return l9Var;
    }
}
