package na;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f17176a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f17176a = field;
    }

    public final String toString() {
        return this.f17176a.toString();
    }
}
