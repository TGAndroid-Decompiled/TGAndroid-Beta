package na;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
public final class b implements ParameterizedType, Serializable {
    public final Type f18523a;
    public final Type f18524b;
    public final Type[] f18525c;

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
        this.f18523a = a2;
        this.f18524b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f18525c = typeArr2;
        int length = typeArr2.length;
        for (int i9 = 0; i9 < length; i9++) {
            Objects.requireNonNull(this.f18525c[i9]);
            d.c(this.f18525c[i9]);
            Type[] typeArr3 = this.f18525c;
            typeArr3[i9] = d.a(typeArr3[i9]);
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
        return (Type[]) this.f18525c.clone();
    }

    @Override
    public final Type getOwnerType() {
        return this.f18523a;
    }

    @Override
    public final Type getRawType() {
        return this.f18524b;
    }

    public final int hashCode() {
        int i9;
        int hashCode = Arrays.hashCode(this.f18525c) ^ this.f18524b.hashCode();
        Type type = this.f18523a;
        if (type != null) {
            i9 = type.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        Type[] typeArr = this.f18525c;
        int length = typeArr.length;
        Type type = this.f18524b;
        if (length == 0) {
            return d.k(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(d.k(type));
        sb2.append("<");
        sb2.append(d.k(typeArr[0]));
        for (int i9 = 1; i9 < length; i9++) {
            sb2.append(", ");
            sb2.append(d.k(typeArr[i9]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
