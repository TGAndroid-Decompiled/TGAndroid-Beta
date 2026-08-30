package nd;
public final class e extends f {
    public final Throwable f14936a;

    public e(Throwable th2) {
        this.f14936a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.j.a(this.f14936a, ((e) obj).f14936a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f14936a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f14936a + ')';
    }
}
