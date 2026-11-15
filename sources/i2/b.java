package i2;

import e2.n0;
import e2.p0;
public final class b implements p0 {
    public final int f15604a;

    public b(int i7) {
        this.f15604a = i7;
    }

    @Override
    public final e2.u a() {
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
        if ((obj instanceof b) && this.f15604a == ((b) obj).f15604a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15604a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f15604a;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
