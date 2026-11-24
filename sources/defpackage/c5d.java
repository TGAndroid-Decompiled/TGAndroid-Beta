package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class c5d extends jhf {
    public final transient f7d h;
    public final transient Object[] n;
    public final transient boolean r;

    public c5d(f7d f7dVar, Object[] objArr) {
        super((byte) 3);
        this.h = f7dVar;
        this.n = objArr;
        this.r = true;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return l().h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return l().listIterator(0);
    }

    @Override
    public final int size() {
        return this.r ? 1 : 0;
    }
}
