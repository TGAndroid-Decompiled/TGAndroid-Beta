package a8;

import java.io.Serializable;
public final class i extends eh implements Serializable {
    public final Object f536b;
    public final dh f537c;

    public i(Object obj, dh dhVar) {
        super(0, false);
        this.f536b = obj;
        this.f537c = dhVar;
    }

    @Override
    public final Object getKey() {
        return this.f536b;
    }

    @Override
    public final Object getValue() {
        return this.f537c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
