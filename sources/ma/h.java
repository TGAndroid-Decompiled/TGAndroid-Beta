package ma;

import java.util.ArrayList;
import java.util.Iterator;

public final class h extends i implements Iterable {

    public final ArrayList f17909a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof h) && ((h) obj).f17909a.equals(this.f17909a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f17909a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.f17909a.iterator();
    }

    @Override
    public final String n() {
        ArrayList arrayList = this.f17909a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).n();
        }
        throw new IllegalStateException(i0.a.k(size, "Array must have size 1, but has size "));
    }
}
