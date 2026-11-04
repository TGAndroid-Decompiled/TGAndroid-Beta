package g9;

import java.util.Map;
public final class u1 extends t0 {
    public final transient l0 d;
    public final transient Object[] f12153e;
    public final transient int f12154f;
    public final transient int h;

    public u1(l0 l0Var, Object[] objArr, int i3, int i10) {
        this.d = l0Var;
        this.f12153e = objArr;
        this.f12154f = i3;
        this.h = i10;
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
    public final int i(int i3, Object[] objArr) {
        return h().i(i3, objArr);
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final g2 n() {
        return h().listIterator(0);
    }

    @Override
    public final i0 r() {
        return new t1(this);
    }

    @Override
    public final int size() {
        return this.h;
    }
}
