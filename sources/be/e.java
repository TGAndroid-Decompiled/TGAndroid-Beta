package be;
public final class e extends f {
    public final Throwable f2226a;

    public e(Throwable th2) {
        this.f2226a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f2226a, ((e) obj).f2226a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f2226a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f2226a + ')';
    }
}
