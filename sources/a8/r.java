package a8;

import java.io.Serializable;
public final class r extends g implements Serializable {
    public final Object f600b;
    public final f f601c;

    public r(Object obj, f fVar) {
        super(0, false);
        this.f600b = obj;
        this.f601c = fVar;
    }

    @Override
    public final Object getKey() {
        return this.f600b;
    }

    @Override
    public final Object getValue() {
        return this.f601c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
