package b8;

import java.util.Iterator;
import java.util.Map;
public final class t extends n {
    public final transient m f3066c;
    public final transient Object[] d;
    public final transient int f3067e = 1;

    public t(m mVar, Object[] objArr) {
        this.f3066c = mVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f3066c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        l lVar = this.f2762b;
        if (lVar == null) {
            lVar = new s(this);
            this.f2762b = lVar;
        }
        return lVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        l lVar = this.f2762b;
        if (lVar == null) {
            lVar = new s(this);
            this.f2762b = lVar;
        }
        return lVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f3067e;
    }
}
