package defpackage;

import java.util.Set;
public abstract class yhd extends ogd implements Set, j$.util.Set {
    public transient fhd b;

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
    public fhd k() {
        fhd fhdVar = this.b;
        if (fhdVar == null) {
            fhd n = n();
            this.b = n;
            return n;
        }
        return fhdVar;
    }

    public fhd n() {
        Object[] array = toArray(ogd.a);
        tgd tgdVar = fhd.b;
        return fhd.o(array.length, array);
    }
}
