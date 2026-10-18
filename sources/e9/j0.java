package e9;

import java.io.Serializable;
public final class j0 extends n implements Serializable {
    public final Object f8463a;
    public final Object f8464b;

    public j0(Object obj, Object obj2) {
        this.f8463a = obj;
        this.f8464b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8463a;
    }

    @Override
    public final Object getValue() {
        return this.f8464b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
