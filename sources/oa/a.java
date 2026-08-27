package oa;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class a implements GenericArrayType, Serializable {

    public final Type f19372a;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f19372a = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.e(this, (GenericArrayType) obj);
    }

    @Override
    public final Type getGenericComponentType() {
        return this.f19372a;
    }

    public final int hashCode() {
        return this.f19372a.hashCode();
    }

    public final String toString() {
        return d.k(this.f19372a) + "[]";
    }
}
