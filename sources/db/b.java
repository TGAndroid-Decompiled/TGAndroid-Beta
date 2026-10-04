package db;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f8194a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f8194a = field;
    }

    public final String toString() {
        return this.f8194a.toString();
    }
}
