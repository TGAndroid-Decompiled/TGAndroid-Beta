package fb;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f10379a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f10379a = field;
    }

    public final String toString() {
        return this.f10379a.toString();
    }
}
