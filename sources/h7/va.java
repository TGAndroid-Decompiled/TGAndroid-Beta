package h7;

import java.util.Iterator;
import java.util.Map;

public final class va extends sa {

    public final transient com.google.android.gms.internal.cast.i0 f8563c;
    public final transient Object[] d;

    public final transient int f8564e = 1;

    public va(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.f8563c = i0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f8563c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        ra uaVar = this.f8541b;
        if (uaVar == null) {
            uaVar = new ua(this);
            this.f8541b = uaVar;
        }
        return uaVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        ra uaVar = this.f8541b;
        if (uaVar == null) {
            uaVar = new ua(this);
            this.f8541b = uaVar;
        }
        return uaVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f8564e;
    }
}
