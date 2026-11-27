package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class tid extends ofd {
    public final transient ybd h;
    public final transient Object[] n;
    public final transient boolean r;

    public tid(ybd ybdVar, Object[] objArr) {
        super((byte) 0);
        this.h = ybdVar;
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
        ted tedVar = this.f;
        if (tedVar == null) {
            tedVar = new oid(this);
            this.f = tedVar;
        }
        return tedVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        ted tedVar = this.f;
        if (tedVar == null) {
            tedVar = new oid(this);
            this.f = tedVar;
        }
        return tedVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.r ? 1 : 0;
    }
}
