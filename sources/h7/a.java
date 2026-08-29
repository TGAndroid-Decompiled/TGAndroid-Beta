package h7;

import java.util.Iterator;
import java.util.Map;
public final class a extends k9 {
    public final transient com.google.android.gms.internal.cast.j0 f7545c;
    public final transient Object[] d;
    public final transient int f7546e = 1;

    public a(com.google.android.gms.internal.cast.j0 j0Var, Object[] objArr) {
        this.f7545c = j0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7545c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        return q().i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return q().listIterator(0);
    }

    @Override
    public final int size() {
        return this.f7546e;
    }
}
