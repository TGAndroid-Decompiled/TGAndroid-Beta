package defpackage;

import java.util.Map;
public final class y59 extends ym5 {
    public final transient qm5 d;
    public final transient Object[] e;
    public final transient boolean f;
    public final transient int h;

    public y59(qm5 qm5Var, Object[] objArr, int i, int i2) {
        this.d = qm5Var;
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
    public final v5c iterator() {
        return h().listIterator(0);
    }

    @Override
    public final mm5 r() {
        return new x59(this);
    }

    @Override
    public final int size() {
        return this.h;
    }
}
