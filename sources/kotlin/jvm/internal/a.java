package kotlin.jvm.internal;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
public final class a implements g, Serializable {
    public final Object f17604a;
    public final boolean f17605b = false;
    public final int f17606c = 2;

    public a(Object obj) {
        this.f17604a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f17605b == aVar.f17605b && this.f17606c == aVar.f17606c && j.a(this.f17604a, aVar.f17604a) && AtomicReference.class.equals(AtomicReference.class)) {
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
        int i7;
        int i10;
        Object obj = this.f17604a;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode = (((((AtomicReference.class.hashCode() + (i7 * 31)) * 31) + 113762) * 31) - 869290769) * 31;
        if (this.f17605b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((hashCode + i10) * 31) + 2) * 31) + this.f17606c;
    }

    public final String toString() {
        s.f17619a.getClass();
        return t.a(this);
    }
}
