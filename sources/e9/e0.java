package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8737a;
    public final Object f8738b;

    public e0(Object obj, Object obj2) {
        this.f8737a = obj;
        this.f8738b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8737a;
    }

    @Override
    public final Object getValue() {
        return this.f8738b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
