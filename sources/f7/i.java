package f7;

import com.google.android.gms.internal.cast.j0;
import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient j0 f6664c;
    public final transient Object[] d;
    public final transient int f6665e;

    public i(j0 j0Var, Object[] objArr, int i10) {
        this.f6664c = j0Var;
        this.d = objArr;
        this.f6665e = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f6664c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        d dVar = this.f6660b;
        if (dVar == null) {
            dVar = new h(this);
            this.f6660b = dVar;
        }
        return dVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f6660b;
        if (dVar == null) {
            dVar = new h(this);
            this.f6660b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f6665e;
    }
}
