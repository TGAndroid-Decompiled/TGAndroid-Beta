package db;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f7575a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f7575a = field;
    }

    public final String toString() {
        return this.f7575a.toString();
    }
}
