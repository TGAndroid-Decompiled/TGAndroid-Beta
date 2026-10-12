package e9;

import java.io.Serializable;
public final class j0 extends n implements Serializable {
    public final Object f8578a;
    public final Object f8579b;

    public j0(Object obj, Object obj2) {
        this.f8578a = obj;
        this.f8579b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8578a;
    }

    @Override
    public final Object getValue() {
        return this.f8579b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
