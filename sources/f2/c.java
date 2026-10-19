package f2;

import b2.q0;
import b2.s0;
public final class c implements s0 {
    public final int f10285a;

    public c(int i10) {
        this.f10285a = i10;
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
        if ((obj instanceof c) && this.f10285a == ((c) obj).f10285a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10285a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f10285a;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
