package f2;

import b2.r0;
import b2.t0;
import b2.x;
public final class b implements t0 {
    public final int f8840a;

    public b(int i10) {
        this.f8840a = i10;
    }

    @Override
    public final x a() {
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
        if ((obj instanceof b) && this.f8840a == ((b) obj).f8840a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8840a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f8840a;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
