package n7;

import java.io.Serializable;
public final class f extends l7.f implements Serializable {
    public final Object f14331b;
    public final l7.e f14332c;

    public f(Object obj, l7.e eVar) {
        super(1, false);
        this.f14331b = obj;
        this.f14332c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f14331b;
    }

    @Override
    public final Object getValue() {
        return this.f14332c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
