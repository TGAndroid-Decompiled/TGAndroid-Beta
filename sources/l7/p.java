package l7;

import java.io.Serializable;
public final class p extends f implements Serializable {
    public final Object f11701b;
    public final e f11702c;

    public p(Object obj, e eVar) {
        super(0, false);
        this.f11701b = obj;
        this.f11702c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f11701b;
    }

    @Override
    public final Object getValue() {
        return this.f11702c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
