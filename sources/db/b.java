package db;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f6665a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f6665a = field;
    }

    public final String toString() {
        return this.f6665a.toString();
    }
}
