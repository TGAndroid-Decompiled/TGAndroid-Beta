package ma;

import j$.util.Objects;
import java.lang.reflect.Field;

public final class b {

    public final Field f17893a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f17893a = field;
    }

    public final String toString() {
        return this.f17893a.toString();
    }
}
