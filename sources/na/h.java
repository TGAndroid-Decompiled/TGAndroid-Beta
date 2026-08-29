package na;

import j7.l1;
import java.util.ArrayList;
import java.util.Iterator;
public final class h extends i implements Iterable {
    public final ArrayList f17192a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof h) || !((h) obj).f17192a.equals(this.f17192a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17192a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.f17192a.iterator();
    }

    @Override
    public final String n() {
        ArrayList arrayList = this.f17192a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).n();
        }
        throw new IllegalStateException(l1.k(size, "Array must have size 1, but has size "));
    }
}
