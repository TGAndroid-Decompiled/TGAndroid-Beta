package e9;

import java.io.Serializable;
public final class j0 extends n implements Serializable {
    public final Object f8467a;
    public final Object f8468b;

    public j0(Object obj, Object obj2) {
        this.f8467a = obj;
        this.f8468b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8467a;
    }

    @Override
    public final Object getValue() {
        return this.f8468b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
