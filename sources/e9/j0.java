package e9;

import java.io.Serializable;
public final class j0 extends n implements Serializable {
    public final Object f6376a;
    public final Object f6377b;

    public j0(Object obj, Object obj2) {
        this.f6376a = obj;
        this.f6377b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f6376a;
    }

    @Override
    public final Object getValue() {
        return this.f6377b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
