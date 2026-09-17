package db;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f6692a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f6692a = field;
    }

    public final String toString() {
        return this.f6692a.toString();
    }
}
