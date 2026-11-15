package h9;

import java.io.Serializable;
public final class e0 extends k implements Serializable {
    public final Object f13674a;
    public final Object f13675b;

    public e0(Object obj, Object obj2) {
        this.f13674a = obj;
        this.f13675b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f13674a;
    }

    @Override
    public final Object getValue() {
        return this.f13675b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
