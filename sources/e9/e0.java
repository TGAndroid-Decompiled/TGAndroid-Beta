package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8068a;
    public final Object f8069b;

    public e0(Object obj, Object obj2) {
        this.f8068a = obj;
        this.f8069b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8068a;
    }

    @Override
    public final Object getValue() {
        return this.f8069b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
