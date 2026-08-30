package b7;

import java.util.Iterator;
import java.util.Map;
public final class t extends q {
    public final u d;

    public t(u uVar) {
        this.d = uVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.d.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return b.b(this.d.entrySet());
    }

    @Override
    public final Iterator iterator() {
        return t().listIterator(0);
    }

    @Override
    public final g0 p() {
        return t().listIterator(0);
    }

    @Override
    public final int size() {
        return this.d.d.size();
    }

    @Override
    public final o u() {
        return new s(this);
    }
}
