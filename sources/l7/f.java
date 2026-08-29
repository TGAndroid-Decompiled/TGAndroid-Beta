package l7;

import java.io.Serializable;
public final class f extends j7.f implements Serializable {
    public final Object f14566b;
    public final j7.e f14567c;

    public f(Object obj, j7.e eVar) {
        super(1, false);
        this.f14566b = obj;
        this.f14567c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f14566b;
    }

    @Override
    public final Object getValue() {
        return this.f14567c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
