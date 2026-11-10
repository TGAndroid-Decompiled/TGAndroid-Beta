package c8;

import java.io.Serializable;
public final class f extends a8.g implements Serializable {
    public final Object f5456b;
    public final a8.f f5457c;

    public f(Object obj, a8.f fVar) {
        super(1, false);
        this.f5456b = obj;
        this.f5457c = fVar;
    }

    @Override
    public final Object getKey() {
        return this.f5456b;
    }

    @Override
    public final Object getValue() {
        return this.f5457c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
