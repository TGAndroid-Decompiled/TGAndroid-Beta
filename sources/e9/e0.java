package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8729a;
    public final Object f8730b;

    public e0(Object obj, Object obj2) {
        this.f8729a = obj;
        this.f8730b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8729a;
    }

    @Override
    public final Object getValue() {
        return this.f8730b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
