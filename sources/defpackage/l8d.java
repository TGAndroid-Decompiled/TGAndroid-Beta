package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class l8d extends r7d {
    public final transient f7d r;
    public final transient Object[] s;
    public final transient int w;

    public l8d(f7d f7dVar, Object[] objArr, int i) {
        super((byte) 2);
        this.r = f7dVar;
        this.s = objArr;
        this.w = i;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.r.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        r6d r6dVar = this.n;
        if (r6dVar == null) {
            r6dVar = new h8d(this);
            this.n = r6dVar;
        }
        return r6dVar.listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        r6d r6dVar = this.n;
        if (r6dVar == null) {
            r6dVar = new h8d(this);
            this.n = r6dVar;
        }
        return r6dVar.p(objArr);
    }

    @Override
    public final int size() {
        return this.w;
    }
}
