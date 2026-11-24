package defpackage;

import java.util.Set;
public abstract class xfd extends ned implements Set, j$.util.Set {
    public transient efd b;

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

    @Override
    public efd k() {
        efd efdVar = this.b;
        if (efdVar == null) {
            efd n = n();
            this.b = n;
            return n;
        }
        return efdVar;
    }

    public efd n() {
        Object[] array = toArray(ned.a);
        sed sedVar = efd.b;
        return efd.o(array.length, array);
    }
}
