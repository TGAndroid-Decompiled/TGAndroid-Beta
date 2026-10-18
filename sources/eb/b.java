package eb;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f8560a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f8560a = field;
    }

    public final String toString() {
        return this.f8560a.toString();
    }
}
