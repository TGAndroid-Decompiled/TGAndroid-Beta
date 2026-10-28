package f2;

import b2.r0;
import b2.t0;
import b2.x;
public final class c implements t0 {
    public final int f10058a;

    public c(int i10) {
        this.f10058a = i10;
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
        if ((obj instanceof c) && this.f10058a == ((c) obj).f10058a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10058a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f10058a;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
