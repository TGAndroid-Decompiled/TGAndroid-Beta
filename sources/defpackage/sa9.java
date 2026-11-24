package defpackage;

import java.io.Serializable;
public final class sa9 implements Serializable {
    public final Throwable a;

    public sa9(Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sa9) {
            if (rp5.a(this.a, ((sa9) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
