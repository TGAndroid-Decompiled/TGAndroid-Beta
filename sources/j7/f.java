package j7;

import java.io.Serializable;
public final class f extends h7.f implements Serializable {
    public final Object f13707b;
    public final h7.e f13708c;

    public f(Object obj, h7.e eVar) {
        super(1, false);
        this.f13707b = obj;
        this.f13708c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f13707b;
    }

    @Override
    public final Object getValue() {
        return this.f13708c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
