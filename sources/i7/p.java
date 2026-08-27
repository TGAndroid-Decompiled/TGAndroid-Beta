package i7;

import java.io.Serializable;

public final class p extends f implements Serializable {

    public final Object f10771b;

    public final e f10772c;

    public p(Object obj, e eVar) {
        super(0, false);
        this.f10771b = obj;
        this.f10772c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f10771b;
    }

    @Override
    public final Object getValue() {
        return this.f10772c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
