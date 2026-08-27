package k7;

import java.util.Iterator;
import java.util.Map;

public final class o extends j {

    public final transient com.google.android.gms.internal.cast.i0 f14895c;
    public final transient Object[] d;

    public final transient int f14896e = 1;

    public o(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.f14895c = i0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f14895c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        i nVar = this.f14835b;
        if (nVar == null) {
            nVar = new n(this);
            this.f14835b = nVar;
        }
        return nVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        i nVar = this.f14835b;
        if (nVar == null) {
            nVar = new n(this);
            this.f14835b = nVar;
        }
        return nVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f14896e;
    }
}
