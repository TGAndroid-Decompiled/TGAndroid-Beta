package a8;

import java.io.Serializable;
public final class r extends g implements Serializable {
    public final Object f598b;
    public final f f599c;

    public r(Object obj, f fVar) {
        super(0, false);
        this.f598b = obj;
        this.f599c = fVar;
    }

    @Override
    public final Object getKey() {
        return this.f598b;
    }

    @Override
    public final Object getValue() {
        return this.f599c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
