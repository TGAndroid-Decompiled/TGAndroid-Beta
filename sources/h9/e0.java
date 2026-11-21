package h9;

import java.io.Serializable;
public final class e0 extends k implements Serializable {
    public final Object f14020a;
    public final Object f14021b;

    public e0(Object obj, Object obj2) {
        this.f14020a = obj;
        this.f14021b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f14020a;
    }

    @Override
    public final Object getValue() {
        return this.f14021b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
