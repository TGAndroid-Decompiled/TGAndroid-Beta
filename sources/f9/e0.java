package f9;

import java.io.Serializable;
public final class e0 extends k implements Serializable {
    public final Object f10276a;
    public final Object f10277b;

    public e0(Object obj, Object obj2) {
        this.f10276a = obj;
        this.f10277b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f10276a;
    }

    @Override
    public final Object getValue() {
        return this.f10277b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
