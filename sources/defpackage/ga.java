package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
public final class ga implements ss4, Serializable {
    public final AtomicReference a;
    public final boolean b = false;
    public final int c = 2;

    public ga(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ga) {
            ga gaVar = (ga) obj;
            if (this.b == gaVar.b && this.c == gaVar.c && ur5.a(this.a, gaVar.a) && AtomicReference.class.equals(AtomicReference.class)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int getArity() {
        return 2;
    }

    public final int hashCode() {
        int i;
        int i2;
        AtomicReference atomicReference = this.a;
        if (atomicReference != null) {
            i = atomicReference.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (((((AtomicReference.class.hashCode() + (i * 31)) * 31) + 113762) * 31) - 869290769) * 31;
        if (this.b) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((hashCode + i2) * 31) + 2) * 31) + this.c;
    }

    public final String toString() {
        s89.a.getClass();
        return t89.a(this);
    }
}
