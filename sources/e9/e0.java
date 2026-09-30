package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8063a;
    public final Object f8064b;

    public e0(Object obj, Object obj2) {
        this.f8063a = obj;
        this.f8064b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8063a;
    }

    @Override
    public final Object getValue() {
        return this.f8064b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
