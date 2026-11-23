package h9;

import java.io.Serializable;
public final class e0 extends k implements Serializable {
    public final Object f13983a;
    public final Object f13984b;

    public e0(Object obj, Object obj2) {
        this.f13983a = obj;
        this.f13984b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f13983a;
    }

    @Override
    public final Object getValue() {
        return this.f13984b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
