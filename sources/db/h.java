package db;

import java.util.ArrayList;
import java.util.Iterator;
public final class h extends i implements Iterable {
    public final ArrayList f6379a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof h) || !((h) obj).f6379a.equals(this.f6379a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6379a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.f6379a.iterator();
    }

    @Override
    public final String n() {
        ArrayList arrayList = this.f6379a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).n();
        }
        throw new IllegalStateException(hc.b.j(size, "Array must have size 1, but has size "));
    }
}
