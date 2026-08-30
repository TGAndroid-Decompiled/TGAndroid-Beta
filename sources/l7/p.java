package l7;

import java.io.Serializable;
public final class p extends f implements Serializable {
    public final Object f11591b;
    public final e f11592c;

    public p(Object obj, e eVar) {
        super(0, false);
        this.f11591b = obj;
        this.f11592c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f11591b;
    }

    @Override
    public final Object getValue() {
        return this.f11592c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
