package l7;

import java.util.Iterator;
import java.util.Map;
public final class y extends t {
    public final transient com.google.android.gms.internal.cast.i0 f11806c;
    public final transient Object[] d;
    public final transient int e = 1;

    public y(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.f11806c = i0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f11806c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        s sVar = this.f11733b;
        if (sVar == null) {
            sVar = new x(this);
            this.f11733b = sVar;
        }
        return sVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        s sVar = this.f11733b;
        if (sVar == null) {
            sVar = new x(this);
            this.f11733b = sVar;
        }
        return sVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
