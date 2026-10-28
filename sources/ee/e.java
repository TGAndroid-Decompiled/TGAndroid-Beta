package ee;
public final class e extends f {
    public final Throwable f9917a;

    public e(Throwable th2) {
        this.f9917a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f9917a, ((e) obj).f9917a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f9917a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f9917a + ')';
    }
}
