package h7;

import com.google.android.gms.internal.cast.h0;
import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient h0 f7332c;
    public final transient Object[] d;
    public final transient int f7333e;

    public i(h0 h0Var, Object[] objArr, int i10) {
        this.f7332c = h0Var;
        this.d = objArr;
        this.f7333e = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7332c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        d dVar = this.f7328b;
        if (dVar == null) {
            dVar = new h(this);
            this.f7328b = dVar;
        }
        return dVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f7328b;
        if (dVar == null) {
            dVar = new h(this);
            this.f7328b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f7333e;
    }
}
