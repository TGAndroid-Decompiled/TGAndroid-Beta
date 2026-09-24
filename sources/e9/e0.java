package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8051a;
    public final Object f8052b;

    public e0(Object obj, Object obj2) {
        this.f8051a = obj;
        this.f8052b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8051a;
    }

    @Override
    public final Object getValue() {
        return this.f8052b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
