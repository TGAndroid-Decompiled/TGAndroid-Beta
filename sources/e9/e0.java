package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8731a;
    public final Object f8732b;

    public e0(Object obj, Object obj2) {
        this.f8731a = obj;
        this.f8732b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8731a;
    }

    @Override
    public final Object getValue() {
        return this.f8732b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
