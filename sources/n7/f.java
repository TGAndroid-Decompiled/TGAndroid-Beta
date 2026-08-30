package n7;

import java.io.Serializable;
public final class f extends l7.f implements Serializable {
    public final Object f14346b;
    public final l7.e f14347c;

    public f(Object obj, l7.e eVar) {
        super(1, false);
        this.f14346b = obj;
        this.f14347c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f14346b;
    }

    @Override
    public final Object getValue() {
        return this.f14347c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
