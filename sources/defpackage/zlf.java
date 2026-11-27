package defpackage;

import java.util.Set;
public abstract class zlf extends qdd implements Set {
    public transient zjf f;

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
        int i;
        int i2 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public final zjf l() {
        zjf zjfVar = this.f;
        if (zjfVar == null) {
            pmf pmfVar = new pmf((v9d) this);
            this.f = pmfVar;
            return pmfVar;
        }
        return zjfVar;
    }
}
