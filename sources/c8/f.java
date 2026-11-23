package c8;

import java.io.Serializable;
public final class f extends a8.g implements Serializable {
    public final Object f4594b;
    public final a8.f f4595c;

    public f(Object obj, a8.f fVar) {
        super(1, false);
        this.f4594b = obj;
        this.f4595c = fVar;
    }

    @Override
    public final Object getKey() {
        return this.f4594b;
    }

    @Override
    public final Object getValue() {
        return this.f4595c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
