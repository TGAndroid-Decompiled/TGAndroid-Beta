package eb;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f8564a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f8564a = field;
    }

    public final String toString() {
        return this.f8564a.toString();
    }
}
