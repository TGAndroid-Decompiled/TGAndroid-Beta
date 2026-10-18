package e9;

import java.io.Serializable;
public final class j0 extends n implements Serializable {
    public final Object f8461a;
    public final Object f8462b;

    public j0(Object obj, Object obj2) {
        this.f8461a = obj;
        this.f8462b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8461a;
    }

    @Override
    public final Object getValue() {
        return this.f8462b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
