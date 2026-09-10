package f2;

import b2.m0;
import b2.o0;
public final class b implements o0 {
    public final int f7682a;

    public b(int i10) {
        this.f7682a = i10;
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
        if ((obj instanceof b) && this.f7682a == ((b) obj).f7682a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7682a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f7682a;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
