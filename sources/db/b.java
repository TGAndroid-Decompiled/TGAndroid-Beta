package db;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f8243a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f8243a = field;
    }

    public final String toString() {
        return this.f8243a.toString();
    }
}
