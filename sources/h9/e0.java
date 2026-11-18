package h9;

import java.io.Serializable;
public final class e0 extends k implements Serializable {
    public final Object f13994a;
    public final Object f13995b;

    public e0(Object obj, Object obj2) {
        this.f13994a = obj;
        this.f13995b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f13994a;
    }

    @Override
    public final Object getValue() {
        return this.f13995b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
