package eb;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f8558a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f8558a = field;
    }

    public final String toString() {
        return this.f8558a.toString();
    }
}
