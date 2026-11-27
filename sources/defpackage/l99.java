package defpackage;

import java.util.Map;
public final class l99 extends bp5 {
    public final transient to5 d;
    public final transient Object[] e;
    public final transient boolean f;
    public final transient int h;

    public l99(to5 to5Var, Object[] objArr, int i, int i2) {
        this.d = to5Var;
        this.e = objArr;
        this.f = i;
        this.h = i2;
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
    public final int i(int i, Object[] objArr) {
        return h().i(i, objArr);
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final v9c iterator() {
        return h().listIterator(0);
    }

    @Override
    public final po5 r() {
        return new k99(this);
    }

    @Override
    public final int size() {
        return this.h;
    }
}
