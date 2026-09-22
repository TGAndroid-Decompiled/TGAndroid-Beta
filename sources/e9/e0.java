package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8066a;
    public final Object f8067b;

    public e0(Object obj, Object obj2) {
        this.f8066a = obj;
        this.f8067b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8066a;
    }

    @Override
    public final Object getValue() {
        return this.f8067b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
