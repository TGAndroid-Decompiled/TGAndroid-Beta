package d7;

import com.google.android.gms.internal.cast.j0;
import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient j0 f4432c;
    public final transient Object[] d;
    public final transient int f4433e;

    public i(j0 j0Var, Object[] objArr, int i9) {
        this.f4432c = j0Var;
        this.d = objArr;
        this.f4433e = i9;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f4432c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        d dVar = this.f4428b;
        if (dVar == null) {
            dVar = new h(this);
            this.f4428b = dVar;
        }
        return dVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f4428b;
        if (dVar == null) {
            dVar = new h(this);
            this.f4428b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f4433e;
    }
}
