package oa;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class c implements WildcardType, Serializable {

    public final Type f19376a;

    public final Type f19377b;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.b(typeArr2.length <= 1);
        d.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.c(typeArr[0]);
            this.f19377b = null;
            this.f19376a = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.c(typeArr2[0]);
        d.b(typeArr[0] == Object.class);
        this.f19377b = d.a(typeArr2[0]);
        this.f19376a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.e(this, (WildcardType) obj);
    }

    @Override
    public final Type[] getLowerBounds() {
        Type type = this.f19377b;
        return type != null ? new Type[]{type} : d.f19378a;
    }

    @Override
    public final Type[] getUpperBounds() {
        return new Type[]{this.f19376a};
    }

    public final int hashCode() {
        Type type = this.f19377b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f19376a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f19377b;
        if (type != null) {
            return "? super " + d.k(type);
        }
        Type type2 = this.f19376a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.k(type2);
    }
}
