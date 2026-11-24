package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class bid extends xfd {
    public final transient f7d c;
    public final transient Object[] d;
    public final transient int e;

    public bid(f7d f7dVar, Object[] objArr, int i) {
        this.c = f7dVar;
        this.d = objArr;
        this.e = i;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return k().h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return k().listIterator(0);
    }

    @Override
    public final efd n() {
        return new uhd(this);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
