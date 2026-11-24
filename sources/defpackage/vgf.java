package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class vgf extends tcf {
    public final transient f7d h;
    public final transient Object[] n;
    public final transient boolean r;

    public vgf(f7d f7dVar, Object[] objArr) {
        super((byte) 2);
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
        f7f f7fVar = this.f;
        if (f7fVar == null) {
            f7fVar = new jgf(this);
            this.f = f7fVar;
        }
        return f7fVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        f7f f7fVar = this.f;
        if (f7fVar == null) {
            f7fVar = new jgf(this);
            this.f = f7fVar;
        }
        return f7fVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.r ? 1 : 0;
    }
}
