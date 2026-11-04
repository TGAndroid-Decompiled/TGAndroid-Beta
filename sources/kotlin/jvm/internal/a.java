package kotlin.jvm.internal;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
public final class a implements g, Serializable {
    public final Object f17347a;
    public final boolean f17348b = false;
    public final int f17349c = 2;

    public a(Object obj) {
        this.f17347a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f17348b == aVar.f17348b && this.f17349c == aVar.f17349c && j.a(this.f17347a, aVar.f17347a) && AtomicReference.class.equals(AtomicReference.class)) {
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
        int i3;
        int i10;
        Object obj = this.f17347a;
        if (obj != null) {
            i3 = obj.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode = (((((AtomicReference.class.hashCode() + (i3 * 31)) * 31) + 113762) * 31) - 869290769) * 31;
        if (this.f17348b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((hashCode + i10) * 31) + 2) * 31) + this.f17349c;
    }

    public final String toString() {
        s.f17362a.getClass();
        return t.a(this);
    }
}
