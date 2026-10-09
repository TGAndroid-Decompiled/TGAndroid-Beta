package e9;

import java.io.Serializable;
public final class e0 extends m implements Serializable {
    public final Object f8732a;
    public final Object f8733b;

    public e0(Object obj, Object obj2) {
        this.f8732a = obj;
        this.f8733b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f8732a;
    }

    @Override
    public final Object getValue() {
        return this.f8733b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
