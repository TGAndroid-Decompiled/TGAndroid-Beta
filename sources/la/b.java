package la;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f16709a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f16709a = field;
    }

    public final String toString() {
        return this.f16709a.toString();
    }
}
