package g9;

import java.io.Serializable;
public final class e0 extends k implements Serializable {
    public final Object f12071a;
    public final Object f12072b;

    public e0(Object obj, Object obj2) {
        this.f12071a = obj;
        this.f12072b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f12071a;
    }

    @Override
    public final Object getValue() {
        return this.f12072b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
