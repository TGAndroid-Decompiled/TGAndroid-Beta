package defpackage;

import java.io.Serializable;
public final class ge9 implements Serializable {
    public final Throwable a;

    public ge9(Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ge9) {
            if (ur5.a(this.a, ((ge9) obj).a)) {
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
