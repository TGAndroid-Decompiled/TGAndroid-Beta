package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class u5e extends q4e {
    public final transient f7d s;
    public final transient Object[] w;
    public final transient int x;

    public u5e(f7d f7dVar, Object[] objArr, int i) {
        super((byte) 5);
        this.s = f7dVar;
        this.w = objArr;
        this.x = i;
    }

    public final u3e A() {
        return new o5e(this);
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
        u3e u3eVar = this.n;
        if (u3eVar == null) {
            u3eVar = A();
            this.n = u3eVar;
        }
        return u3eVar.listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        u3e u3eVar = this.n;
        if (u3eVar == null) {
            u3eVar = A();
            this.n = u3eVar;
        }
        return u3eVar.p(objArr);
    }

    @Override
    public final int size() {
        return this.x;
    }
}
