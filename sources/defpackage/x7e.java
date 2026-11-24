package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class x7e extends t6e {
    public final transient h9d s;
    public final transient Object[] w;
    public final transient int x;

    public x7e(h9d h9dVar, Object[] objArr, int i) {
        super((byte) 5);
        this.s = h9dVar;
        this.w = objArr;
        this.x = i;
    }

    public final x5e A() {
        return new r7e(this);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.s.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        x5e x5eVar = this.n;
        if (x5eVar == null) {
            x5eVar = A();
            this.n = x5eVar;
        }
        return x5eVar.listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        x5e x5eVar = this.n;
        if (x5eVar == null) {
            x5eVar = A();
            this.n = x5eVar;
        }
        return x5eVar.p(objArr);
    }

    @Override
    public final int size() {
        return this.x;
    }
}
