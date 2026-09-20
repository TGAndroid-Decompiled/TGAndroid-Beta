package db;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f7593a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f7593a = field;
    }

    public final String toString() {
        return this.f7593a.toString();
    }
}
