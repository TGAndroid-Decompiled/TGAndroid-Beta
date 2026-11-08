package kotlin.jvm.internal;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
public final class a implements g, Serializable {
    public final Object f17601a;
    public final boolean f17602b = false;
    public final int f17603c = 2;

    public a(Object obj) {
        this.f17601a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f17602b == aVar.f17602b && this.f17603c == aVar.f17603c && j.a(this.f17601a, aVar.f17601a) && AtomicReference.class.equals(AtomicReference.class)) {
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
        Object obj = this.f17601a;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode = (((((AtomicReference.class.hashCode() + (i7 * 31)) * 31) + 113762) * 31) - 869290769) * 31;
        if (this.f17602b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((hashCode + i10) * 31) + 2) * 31) + this.f17603c;
    }

    public final String toString() {
        s.f17616a.getClass();
        return t.a(this);
    }
}
