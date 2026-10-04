package db;

import hg.k0;
import java.util.ArrayList;
import java.util.Iterator;
public final class h extends i implements Iterable {
    public final ArrayList f8209a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof h) || !((h) obj).f8209a.equals(this.f8209a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8209a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.f8209a.iterator();
    }

    @Override
    public final String n() {
        ArrayList arrayList = this.f8209a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).n();
        }
        throw new IllegalStateException(k0.h(size, "Array must have size 1, but has size "));
    }
}
