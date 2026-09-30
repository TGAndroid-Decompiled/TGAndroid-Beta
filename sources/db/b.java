package db;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f7587a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f7587a = field;
    }

    public final String toString() {
        return this.f7587a.toString();
    }
}
