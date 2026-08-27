package e7;

import com.google.android.gms.internal.cast.i0;
import java.util.Iterator;
import java.util.Map;

public final class i extends f {

    public final transient i0 f5327c;
    public final transient Object[] d;

    public final transient int f5328e;

    public i(i0 i0Var, Object[] objArr, int i10) {
        this.f5327c = i0Var;
        this.d = objArr;
        this.f5328e = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5327c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        d hVar = this.f5323b;
        if (hVar == null) {
            hVar = new h(this);
            this.f5323b = hVar;
        }
        return hVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        d hVar = this.f5323b;
        if (hVar == null) {
            hVar = new h(this);
            this.f5323b = hVar;
        }
        return hVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f5328e;
    }
}
