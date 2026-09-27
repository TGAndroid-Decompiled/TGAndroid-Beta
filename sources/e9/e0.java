package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8053a;
    public final Object f8054b;

    public e0(Object obj, Object obj2) {
        this.f8053a = obj;
        this.f8054b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8053a;
    }

    @Override
    public final Object getValue() {
        return this.f8054b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
