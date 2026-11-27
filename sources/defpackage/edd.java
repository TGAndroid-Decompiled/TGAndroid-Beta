package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class edd extends kcd {
    public final transient ybd r;
    public final transient Object[] s;
    public final transient int w;

    public edd(ybd ybdVar, Object[] objArr, int i) {
        super((byte) 2);
        this.r = ybdVar;
        this.s = objArr;
        this.w = i;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.r.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        kbd kbdVar = this.n;
        if (kbdVar == null) {
            kbdVar = new add(this);
            this.n = kbdVar;
        }
        return kbdVar.listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        kbd kbdVar = this.n;
        if (kbdVar == null) {
            kbdVar = new add(this);
            this.n = kbdVar;
        }
        return kbdVar.p(objArr);
    }

    @Override
    public final int size() {
        return this.w;
    }
}
