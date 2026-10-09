package f2;

import b2.m0;
import b2.o0;
public final class c implements o0 {
    public final int f9562a;

    public c(int i10) {
        this.f9562a = i10;
    }

    @Override
    public final b2.s a() {
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
        if ((obj instanceof c) && this.f9562a == ((c) obj).f9562a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9562a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f9562a;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
