package be;
public final class h extends i {
    public final Throwable f3170a;

    public h(Throwable th2) {
        this.f3170a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (kotlin.jvm.internal.j.a(this.f3170a, ((h) obj).f3170a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f3170a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f3170a + ')';
    }
}
