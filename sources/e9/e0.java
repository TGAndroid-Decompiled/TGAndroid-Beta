package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f7369a;
    public final Object f7370b;

    public e0(Object obj, Object obj2) {
        this.f7369a = obj;
        this.f7370b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f7369a;
    }

    @Override
    public final Object getValue() {
        return this.f7370b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
