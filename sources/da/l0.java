package da;
public final class l0 extends y1 {
    public final int f8409a;

    public l0(int i7) {
        this.f8409a = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            if (this.f8409a == ((l0) ((y1) obj)).f8409a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.f8409a;
    }

    public final String toString() {
        return a8.p0.n(this.f8409a, "}", new StringBuilder("ProfilingTrigger{trigger="));
    }
}
