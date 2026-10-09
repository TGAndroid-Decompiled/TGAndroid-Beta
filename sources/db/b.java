package db;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f8246a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f8246a = field;
    }

    public final String toString() {
        return this.f8246a.toString();
    }
}
