package o8;

import java.io.Serializable;
public final class v extends j implements Serializable {
    public final Object f19095a;
    public final Object f19096b;

    public v(Object obj, Object obj2) {
        this.f19095a = obj;
        this.f19096b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f19095a;
    }

    @Override
    public final Object getValue() {
        return this.f19096b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
