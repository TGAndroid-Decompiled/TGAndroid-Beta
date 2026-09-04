package e9;

import java.util.Map;
public final class c1 extends m0 {
    public final transient k0 d;
    public final transient Object[] f8927e;
    public final transient int f8928f;
    public final transient int h;

    public c1(k0 k0Var, Object[] objArr, int i10, int i11) {
        this.d = k0Var;
        this.f8927e = objArr;
        this.f8928f = i10;
        this.h = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        return i().n(i10, objArr);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final o1 s() {
        return i().listIterator(0);
    }

    @Override
    public final int size() {
        return this.h;
    }

    @Override
    public final i0 w() {
        return new b1(this);
    }
}
