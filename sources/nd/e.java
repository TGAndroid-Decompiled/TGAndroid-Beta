package nd;
public final class e extends f {
    public final Throwable f15956a;

    public e(Throwable th2) {
        this.f15956a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.j.a(this.f15956a, ((e) obj).f15956a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f15956a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f15956a + ')';
    }
}
