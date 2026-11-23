package h9;

import java.io.Serializable;
public final class e0 extends k implements Serializable {
    public final Object f14023a;
    public final Object f14024b;

    public e0(Object obj, Object obj2) {
        this.f14023a = obj;
        this.f14024b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f14023a;
    }

    @Override
    public final Object getValue() {
        return this.f14024b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
