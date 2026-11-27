package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class kae extends g9e {
    public final transient ybd s;
    public final transient Object[] w;
    public final transient int x;

    public kae(ybd ybdVar, Object[] objArr, int i) {
        super((byte) 5);
        this.s = ybdVar;
        this.w = objArr;
        this.x = i;
    }

    public final k8e A() {
        return new eae(this);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.s.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        k8e k8eVar = this.n;
        if (k8eVar == null) {
            k8eVar = A();
            this.n = k8eVar;
        }
        return k8eVar.listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        k8e k8eVar = this.n;
        if (k8eVar == null) {
            k8eVar = A();
            this.n = k8eVar;
        }
        return k8eVar.p(objArr);
    }

    @Override
    public final int size() {
        return this.x;
    }
}
