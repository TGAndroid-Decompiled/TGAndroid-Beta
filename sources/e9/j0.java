package e9;

import java.io.Serializable;
public final class j0 extends n implements Serializable {
    public final Object f8581a;
    public final Object f8582b;

    public j0(Object obj, Object obj2) {
        this.f8581a = obj;
        this.f8582b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8581a;
    }

    @Override
    public final Object getValue() {
        return this.f8582b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
