package da;
public final class l0 extends y1 {
    public final int f8074a;

    public l0(int i7) {
        this.f8074a = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            if (this.f8074a == ((l0) ((y1) obj)).f8074a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.f8074a;
    }

    public final String toString() {
        return a8.p0.n(this.f8074a, "}", new StringBuilder("ProfilingTrigger{trigger="));
    }
}
