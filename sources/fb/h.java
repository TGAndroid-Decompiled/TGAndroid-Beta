package fb;

import java.util.ArrayList;
import java.util.Iterator;
public final class h extends i implements Iterable {
    public final ArrayList f10395a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof h) || !((h) obj).f10395a.equals(this.f10395a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10395a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.f10395a.iterator();
    }

    @Override
    public final String m() {
        ArrayList arrayList = this.f10395a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).m();
        }
        throw new IllegalStateException(ic.a.i(size, "Array must have size 1, but has size "));
    }
}
