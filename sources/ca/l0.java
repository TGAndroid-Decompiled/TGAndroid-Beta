package ca;
public final class l0 extends y1 {
    public final int f4437a;

    public l0(int i3) {
        this.f4437a = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            if (this.f4437a == ((l0) ((y1) obj)).f4437a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.f4437a;
    }

    public final String toString() {
        return a1.g.o(this.f4437a, "}", new StringBuilder("ProfilingTrigger{trigger="));
    }
}
