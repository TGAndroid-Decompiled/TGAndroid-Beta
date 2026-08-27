package k7;

import java.io.Serializable;

public final class f extends i7.f implements Serializable {

    public final Object f14561b;

    public final i7.e f14562c;

    public f(Object obj, i7.e eVar) {
        super(1, false);
        this.f14561b = obj;
        this.f14562c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f14561b;
    }

    @Override
    public final Object getValue() {
        return this.f14562c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
