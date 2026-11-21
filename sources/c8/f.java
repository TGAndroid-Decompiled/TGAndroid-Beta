package c8;

import java.io.Serializable;
public final class f extends a8.g implements Serializable {
    public final Object f4591b;
    public final a8.f f4592c;

    public f(Object obj, a8.f fVar) {
        super(1, false);
        this.f4591b = obj;
        this.f4592c = fVar;
    }

    @Override
    public final Object getKey() {
        return this.f4591b;
    }

    @Override
    public final Object getValue() {
        return this.f4592c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
