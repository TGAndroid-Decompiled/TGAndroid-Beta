package h9;

import java.io.Serializable;
public final class e0 extends k implements Serializable {
    public final Object f14317a;
    public final Object f14318b;

    public e0(Object obj, Object obj2) {
        this.f14317a = obj;
        this.f14318b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f14317a;
    }

    @Override
    public final Object getValue() {
        return this.f14318b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
