package l7;

import java.io.Serializable;
public final class p extends f implements Serializable {
    public final Object f11986b;
    public final e f11987c;

    public p(Object obj, e eVar) {
        super(0, false);
        this.f11986b = obj;
        this.f11987c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f11986b;
    }

    @Override
    public final Object getValue() {
        return this.f11987c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
