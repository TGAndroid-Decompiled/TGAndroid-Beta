package na;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
public final class a implements GenericArrayType, Serializable {
    public final Type f18522a;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f18522a = d.a(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && d.e(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Type getGenericComponentType() {
        return this.f18522a;
    }

    public final int hashCode() {
        return this.f18522a.hashCode();
    }

    public final String toString() {
        return d.k(this.f18522a) + "[]";
    }
}
