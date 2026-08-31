package k7;

import java.util.Iterator;
import java.util.Map;
public final class va extends sa {
    public final transient com.google.android.gms.internal.cast.h0 f10746c;
    public final transient Object[] d;
    public final transient int f10747e = 1;

    public va(com.google.android.gms.internal.cast.h0 h0Var, Object[] objArr) {
        this.f10746c = h0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f10746c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        ra raVar = this.f10722b;
        if (raVar == null) {
            raVar = new ua(this);
            this.f10722b = raVar;
        }
        return raVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        ra raVar = this.f10722b;
        if (raVar == null) {
            raVar = new ua(this);
            this.f10722b = raVar;
        }
        return raVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f10747e;
    }
}
