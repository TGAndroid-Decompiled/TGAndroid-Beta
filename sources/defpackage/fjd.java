package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class fjd extends mid {
    public final njd s;

    public fjd(njd njdVar) {
        super((byte) 4);
        this.s = njdVar;
    }

    @Override
    public final xhd B() {
        return new zid(this);
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
        return a1f.a(this.s.entrySet());
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
    public final v5c u() {
        return A().listIterator(0);
    }
}
