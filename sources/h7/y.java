package h7;

import java.util.Iterator;
import java.util.Map;
public final class y extends t {
    public final transient com.google.android.gms.internal.cast.j0 f10180c;
    public final transient Object[] d;
    public final transient int f10181e = 1;

    public y(com.google.android.gms.internal.cast.j0 j0Var, Object[] objArr) {
        this.f10180c = j0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f10180c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        s sVar = this.f10119b;
        if (sVar == null) {
            sVar = new x(this);
            this.f10119b = sVar;
        }
        return sVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        s sVar = this.f10119b;
        if (sVar == null) {
            sVar = new x(this);
            this.f10119b = sVar;
        }
        return sVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f10181e;
    }
}
