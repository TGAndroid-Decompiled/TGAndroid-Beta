package fb;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
public final class b implements ParameterizedType, Serializable {
    public final Type f8997a;
    public final Type f8998b;
    public final Type[] f8999c;

    public b(Type type, Type type2, Type... typeArr) {
        Type a2;
        Objects.requireNonNull(type2);
        if (type == null && (type2 instanceof Class)) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException("Must specify owner type for " + type2);
            }
        }
        if (type == null) {
            a2 = null;
        } else {
            a2 = d.a(type);
        }
        this.f8997a = a2;
        this.f8998b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f8999c = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f8999c[i10]);
            d.c(this.f8999c[i10]);
            Type[] typeArr3 = this.f8999c;
            typeArr3[i10] = d.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && d.e(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f8999c.clone();
    }

    @Override
    public final Type getOwnerType() {
        return this.f8997a;
    }

    @Override
    public final Type getRawType() {
        return this.f8998b;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f8999c) ^ this.f8998b.hashCode();
        Type type = this.f8997a;
        if (type != null) {
            i10 = type.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        Type[] typeArr = this.f8999c;
        int length = typeArr.length;
        Type type = this.f8998b;
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
