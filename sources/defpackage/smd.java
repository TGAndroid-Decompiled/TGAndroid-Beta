package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class smd extends okd {
    public final transient ybd c;
    public final transient Object[] d;
    public final transient int e;

    public smd(ybd ybdVar, Object[] objArr, int i) {
        this.c = ybdVar;
        this.d = objArr;
        this.e = i;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return k().h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return k().listIterator(0);
    }

    @Override
    public final vjd n() {
        return new lmd(this);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
