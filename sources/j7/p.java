package j7;

import java.io.Serializable;
public final class p extends f implements Serializable {
    public final Object f11145b;
    public final e f11146c;

    public p(Object obj, e eVar) {
        super(0, false);
        this.f11145b = obj;
        this.f11146c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f11145b;
    }

    @Override
    public final Object getValue() {
        return this.f11146c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
