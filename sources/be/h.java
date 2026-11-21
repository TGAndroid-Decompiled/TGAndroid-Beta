package be;
public final class h extends i {
    public final Throwable f3182a;

    public h(Throwable th2) {
        this.f3182a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (kotlin.jvm.internal.j.a(this.f3182a, ((h) obj).f3182a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f3182a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f3182a + ')';
    }
}
