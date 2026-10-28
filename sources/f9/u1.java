package f9;

import java.util.Map;
public final class u1 extends t0 {
    public final transient l0 d;
    public final transient Object[] e;
    public final transient int f10347f;
    public final transient int h;

    public u1(l0 l0Var, Object[] objArr, int i10, int i11) {
        this.d = l0Var;
        this.e = objArr;
        this.f10347f = i10;
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
    public final g2 r() {
        return h().listIterator(0);
    }

    @Override
    public final int size() {
        return this.h;
    }

    @Override
    public final i0 v() {
        return new t1(this);
    }
}
