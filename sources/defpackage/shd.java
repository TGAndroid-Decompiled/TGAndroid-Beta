package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class shd extends cfd {
    public final transient h9d h;
    public final transient Object[] n;
    public final transient boolean r;

    public shd(h9d h9dVar, Object[] objArr) {
        super((byte) 1);
        this.h = h9dVar;
        this.n = objArr;
        this.r = true;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        ped pedVar = this.f;
        if (pedVar == null) {
            pedVar = new nhd(this);
            this.f = pedVar;
        }
        return pedVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        ped pedVar = this.f;
        if (pedVar == null) {
            pedVar = new nhd(this);
            this.f = pedVar;
        }
        return pedVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.r ? 1 : 0;
    }
}
