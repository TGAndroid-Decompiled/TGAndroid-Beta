package eb;

import i2.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class h extends i implements Iterable {
    public final ArrayList f8579a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof h) || !((h) obj).f8579a.equals(this.f8579a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8579a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.f8579a.iterator();
    }

    @Override
    public final String m() {
        ArrayList arrayList = this.f8579a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).m();
        }
        throw new IllegalStateException(o1.k(size, "Array must have size 1, but has size "));
    }
}
