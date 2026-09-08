package fb;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
public final class c implements WildcardType, Serializable {
    public final Type f9447a;
    public final Type f9448b;

    public c(Type[] typeArr, Type[] typeArr2) {
        boolean z10;
        boolean z11;
        if (typeArr2.length <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.b(z10);
        if (typeArr.length == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        d.b(z11);
        if (typeArr2.length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            d.c(typeArr2[0]);
            d.b(typeArr[0] == Object.class);
            this.f9448b = d.a(typeArr2[0]);
            this.f9447a = Object.class;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        d.c(typeArr[0]);
        this.f9448b = null;
        this.f9447a = d.a(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && d.e(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Type[] getLowerBounds() {
        Type type = this.f9448b;
        return type != null ? new Type[]{type} : d.f9449a;
    }

    @Override
    public final Type[] getUpperBounds() {
        return new Type[]{this.f9447a};
    }

    public final int hashCode() {
        int i10;
        Type type = this.f9448b;
        if (type != null) {
            i10 = type.hashCode() + 31;
        } else {
            i10 = 1;
        }
        return i10 ^ (this.f9447a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f9448b;
        if (type != null) {
            return "? super " + d.k(type);
        }
        Type type2 = this.f9447a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.k(type2);
    }
}
