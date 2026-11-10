package h9;

import java.util.Map;
public final class v1 extends t0 {
    public final transient l0 d;
    public final transient Object[] f14407e;
    public final transient int f14408f;
    public final transient int h;

    public v1(l0 l0Var, Object[] objArr, int i7, int i10) {
        this.d = l0Var;
        this.f14407e = objArr;
        this.f14408f = i7;
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
    public final int i(int i7, Object[] objArr) {
        return f().i(i7, objArr);
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final h2 n() {
        return f().listIterator(0);
    }

    @Override
    public final i0 r() {
        return new u1(this);
    }

    @Override
    public final int size() {
        return this.h;
    }
}
