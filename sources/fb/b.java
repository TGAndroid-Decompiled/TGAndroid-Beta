package fb;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f10380a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f10380a = field;
    }

    public final String toString() {
        return this.f10380a.toString();
    }
}
