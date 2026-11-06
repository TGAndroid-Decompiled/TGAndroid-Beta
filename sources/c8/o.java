package c8;

import java.util.Iterator;
import java.util.Map;
public final class o extends j {
    public final transient a8.v f5779c;
    public final transient Object[] d;
    public final transient int f5780e = 1;

    public o(a8.v vVar, Object[] objArr) {
        this.f5779c = vVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5779c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        i iVar = this.f5725b;
        if (iVar == null) {
            iVar = new n(this);
            this.f5725b = iVar;
        }
        return iVar.f(objArr);
    }

    @Override
    public final Iterator iterator() {
        i iVar = this.f5725b;
        if (iVar == null) {
            iVar = new n(this);
            this.f5725b = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f5780e;
    }
}
