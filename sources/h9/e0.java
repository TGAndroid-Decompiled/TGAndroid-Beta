package h9;

import java.io.Serializable;
public final class e0 extends k implements Serializable {
    public final Object f14319a;
    public final Object f14320b;

    public e0(Object obj, Object obj2) {
        this.f14319a = obj;
        this.f14320b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f14319a;
    }

    @Override
    public final Object getValue() {
        return this.f14320b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
