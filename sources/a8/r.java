package a8;

import java.io.Serializable;
public final class r extends g implements Serializable {
    public final Object f601b;
    public final f f602c;

    public r(Object obj, f fVar) {
        super(0, false);
        this.f601b = obj;
        this.f602c = fVar;
    }

    @Override
    public final Object getKey() {
        return this.f601b;
    }

    @Override
    public final Object getValue() {
        return this.f602c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
