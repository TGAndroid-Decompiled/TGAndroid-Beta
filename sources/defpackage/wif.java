package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class wif extends uef {
    public final transient h9d h;
    public final transient Object[] n;
    public final transient boolean r;

    public wif(h9d h9dVar, Object[] objArr) {
        super((byte) 2);
        this.h = h9dVar;
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
        h9f h9fVar = this.f;
        if (h9fVar == null) {
            h9fVar = new kif(this);
            this.f = h9fVar;
        }
        return h9fVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        h9f h9fVar = this.f;
        if (h9fVar == null) {
            h9fVar = new kif(this);
            this.f = h9fVar;
        }
        return h9fVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.r ? 1 : 0;
    }
}
