package i7;

import java.util.Iterator;
import java.util.Map;

public final class y extends t {

    public final transient com.google.android.gms.internal.cast.i0 f10889c;
    public final transient Object[] d;

    public final transient int f10890e = 1;

    public y(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.f10889c = i0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f10889c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        s xVar = this.f10828b;
        if (xVar == null) {
            xVar = new x(this);
            this.f10828b = xVar;
        }
        return xVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        s xVar = this.f10828b;
        if (xVar == null) {
            xVar = new x(this);
            this.f10828b = xVar;
        }
        return xVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f10890e;
    }
}
