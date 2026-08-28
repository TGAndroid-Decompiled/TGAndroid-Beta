package o8;

import java.util.Map;
public final class n0 extends c0 {
    public final transient b0 d;
    public final transient Object[] f19062e;
    public final transient int f19063f;

    public n0(b0 b0Var, Object[] objArr, int i9) {
        this.d = b0Var;
        this.f19062e = objArr;
        this.f19063f = i9;
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
    public final int n(int i9, Object[] objArr) {
        return i().n(i9, objArr);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.f19063f;
    }

    @Override
    public final z v() {
        return new m0(this);
    }

    @Override
    public final x0 w() {
        return i().listIterator(0);
    }
}
