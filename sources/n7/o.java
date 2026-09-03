package n7;

import java.util.Iterator;
import java.util.Map;
public final class o extends j {
    public final transient com.google.android.gms.internal.cast.h0 f15672c;
    public final transient Object[] d;
    public final transient int f15673e = 1;

    public o(com.google.android.gms.internal.cast.h0 h0Var, Object[] objArr) {
        this.f15672c = h0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f15672c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        i iVar = this.f15603b;
        if (iVar == null) {
            iVar = new n(this);
            this.f15603b = iVar;
        }
        return iVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        i iVar = this.f15603b;
        if (iVar == null) {
            iVar = new n(this);
            this.f15603b = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f15673e;
    }
}
