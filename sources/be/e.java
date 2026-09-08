package be;
public final class e extends f {
    public final Throwable f2645a;

    public e(Throwable th2) {
        this.f2645a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f2645a, ((e) obj).f2645a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f2645a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f2645a + ')';
    }
}
