package k7;

import java.util.Iterator;
import java.util.Map;
public final class va extends sa {
    public final transient com.google.android.gms.internal.cast.i0 f9993c;
    public final transient Object[] d;
    public final transient int e = 1;

    public va(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.f9993c = i0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f9993c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        ra raVar = this.f9970b;
        if (raVar == null) {
            raVar = new ua(this);
            this.f9970b = raVar;
        }
        return raVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        ra raVar = this.f9970b;
        if (raVar == null) {
            raVar = new ua(this);
            this.f9970b = raVar;
        }
        return raVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
