package f2;

import b2.q0;
import b2.s0;
public final class c implements s0 {
    public final int f10286a;

    public c(int i10) {
        this.f10286a = i10;
    }

    @Override
    public final b2.w a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f10286a == ((c) obj).f10286a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10286a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f10286a;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
