package be;
public final class h extends i {
    public final Throwable f3172a;

    public h(Throwable th2) {
        this.f3172a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (kotlin.jvm.internal.j.a(this.f3172a, ((h) obj).f3172a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f3172a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f3172a + ')';
    }
}
