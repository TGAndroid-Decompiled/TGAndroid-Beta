package defpackage;

import java.io.Serializable;
public final class sc9 implements Serializable {
    public final Throwable a;

    public sc9(Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sc9) {
            if (rr5.a(this.a, ((sc9) obj).a)) {
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
