package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class ced extends vad {
    public final transient f7d h;
    public final transient Object[] n;
    public final transient boolean r;

    public ced(f7d f7dVar, Object[] objArr) {
        super((byte) 0);
        this.h = f7dVar;
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
        aad aadVar = this.f;
        if (aadVar == null) {
            aadVar = new wdd(this);
            this.f = aadVar;
        }
        return aadVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        aad aadVar = this.f;
        if (aadVar == null) {
            aadVar = new wdd(this);
            this.f = aadVar;
        }
        return aadVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.r ? 1 : 0;
    }
}
