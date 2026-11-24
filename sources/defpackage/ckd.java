package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class ckd extends yhd {
    public final transient h9d c;
    public final transient Object[] d;
    public final transient int e;

    public ckd(h9d h9dVar, Object[] objArr, int i) {
        this.c = h9dVar;
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
    public final fhd n() {
        return new vjd(this);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
