package la;

import j3.r0;
import java.util.ArrayList;
import java.util.Iterator;
public final class h extends i implements Iterable {
    public final ArrayList f16725a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof h) || !((h) obj).f16725a.equals(this.f16725a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16725a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.f16725a.iterator();
    }

    @Override
    public final String n() {
        ArrayList arrayList = this.f16725a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).n();
        }
        throw new IllegalStateException(r0.l(size, "Array must have size 1, but has size "));
    }
}
