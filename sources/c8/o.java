package c8;

import java.util.Iterator;
import java.util.Map;
public final class o extends j {
    public final transient a8.v f4607c;
    public final transient Object[] d;
    public final transient int f4608e = 1;

    public o(a8.v vVar, Object[] objArr) {
        this.f4607c = vVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f4607c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        i iVar = this.f4554b;
        if (iVar == null) {
            iVar = new n(this);
            this.f4554b = iVar;
        }
        return iVar.f(objArr);
    }

    @Override
    public final Iterator iterator() {
        i iVar = this.f4554b;
        if (iVar == null) {
            iVar = new n(this);
            this.f4554b = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f4608e;
    }
}
