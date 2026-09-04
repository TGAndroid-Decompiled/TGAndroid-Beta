package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8937a;
    public final Object f8938b;

    public e0(Object obj, Object obj2) {
        this.f8937a = obj;
        this.f8938b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8937a;
    }

    @Override
    public final Object getValue() {
        return this.f8938b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
