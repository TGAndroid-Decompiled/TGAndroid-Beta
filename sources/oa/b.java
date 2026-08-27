package oa;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public final class b implements ParameterizedType, Serializable {

    public final Type f19373a;

    public final Type f19374b;

    public final Type[] f19375c;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type == null && (type2 instanceof Class)) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException("Must specify owner type for " + type2);
            }
        }
        this.f19373a = type == null ? null : d.a(type);
        this.f19374b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f19375c = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f19375c[i10]);
            d.c(this.f19375c[i10]);
            Type[] typeArr3 = this.f19375c;
            typeArr3[i10] = d.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.e(this, (ParameterizedType) obj);
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f19375c.clone();
    }

    @Override
    public final Type getOwnerType() {
        return this.f19373a;
    }

    @Override
    public final Type getRawType() {
        return this.f19374b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f19375c) ^ this.f19374b.hashCode();
        Type type = this.f19373a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f19375c;
        int length = typeArr.length;
        Type type = this.f19374b;
        if (length == 0) {
            return d.k(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(d.k(type));
        sb2.append("<");
        sb2.append(d.k(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(", ");
            sb2.append(d.k(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
