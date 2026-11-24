package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class nad extends t9d {
    public final transient h9d r;
    public final transient Object[] s;
    public final transient int w;

    public nad(h9d h9dVar, Object[] objArr, int i) {
        super((byte) 2);
        this.r = h9dVar;
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
        t8d t8dVar = this.n;
        if (t8dVar == null) {
            t8dVar = new jad(this);
            this.n = t8dVar;
        }
        return t8dVar.listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        t8d t8dVar = this.n;
        if (t8dVar == null) {
            t8dVar = new jad(this);
            this.n = t8dVar;
        }
        return t8dVar.p(objArr);
    }

    @Override
    public final int size() {
        return this.w;
    }
}
