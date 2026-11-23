package h9;

import java.io.Serializable;
public final class e0 extends k implements Serializable {
    public final Object f13986a;
    public final Object f13987b;

    public e0(Object obj, Object obj2) {
        this.f13986a = obj;
        this.f13987b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f13986a;
    }

    @Override
    public final Object getValue() {
        return this.f13987b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
