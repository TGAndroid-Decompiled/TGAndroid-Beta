package h7;

import java.io.Serializable;
public final class p extends f implements Serializable {
    public final Object f10062b;
    public final e f10063c;

    public p(Object obj, e eVar) {
        super(0, false);
        this.f10062b = obj;
        this.f10063c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f10062b;
    }

    @Override
    public final Object getValue() {
        return this.f10063c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
