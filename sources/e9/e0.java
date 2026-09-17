package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8965a;
    public final Object f8966b;

    public e0(Object obj, Object obj2) {
        this.f8965a = obj;
        this.f8966b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8965a;
    }

    @Override
    public final Object getValue() {
        return this.f8966b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
