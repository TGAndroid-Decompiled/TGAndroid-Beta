package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class hld extends okd {
    public final pld s;

    public hld(pld pldVar) {
        super((byte) 4);
        this.s = pldVar;
    }

    @Override
    public final yjd B() {
        return new bld(this);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.s.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return c3f.a(this.s.entrySet());
    }

    @Override
    public final Iterator iterator() {
        return A().listIterator(0);
    }

    @Override
    public final int size() {
        return this.s.d.size();
    }

    @Override
    public final v7c u() {
        return A().listIterator(0);
    }
}
