package db;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f7590a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f7590a = field;
    }

    public final String toString() {
        return this.f7590a.toString();
    }
}
