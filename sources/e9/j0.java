package e9;

import java.io.Serializable;
public final class j0 extends n implements Serializable {
    public final Object f8460a;
    public final Object f8461b;

    public j0(Object obj, Object obj2) {
        this.f8460a = obj;
        this.f8461b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8460a;
    }

    @Override
    public final Object getValue() {
        return this.f8461b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
