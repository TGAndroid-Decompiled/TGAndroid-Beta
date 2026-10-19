package e9;

import java.util.Map;
public final class z1 extends y0 {
    public final transient q0 d;
    public final transient Object[] e;
    public final transient int f8540f;
    public final transient int h;

    public z1(q0 q0Var, Object[] objArr, int i10, int i11) {
        this.d = q0Var;
        this.e = objArr;
        this.f8540f = i10;
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
    public final int m(int i10, Object[] objArr) {
        return h().m(i10, objArr);
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final m2 r() {
        return h().listIterator(0);
    }

    @Override
    public final int size() {
        return this.h;
    }

    @Override
    public final n0 v() {
        return new y1(this);
    }
}
