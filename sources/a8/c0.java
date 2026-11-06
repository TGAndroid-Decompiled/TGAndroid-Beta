package a8;

import java.util.Iterator;
import java.util.Map;
public final class c0 extends w {
    public final transient v f345c;
    public final transient Object[] d;
    public final transient int f346e = 1;

    public c0(v vVar, Object[] objArr) {
        this.f345c = vVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f345c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        u uVar = this.f690b;
        if (uVar == null) {
            uVar = new b0(this);
            this.f690b = uVar;
        }
        return uVar.f(objArr);
    }

    @Override
    public final Iterator iterator() {
        u uVar = this.f690b;
        if (uVar == null) {
            uVar = new b0(this);
            this.f690b = uVar;
        }
        return uVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f346e;
    }
}
