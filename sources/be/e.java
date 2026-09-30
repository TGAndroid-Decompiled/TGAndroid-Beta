package be;
public final class e extends f {
    public final Throwable f3525a;

    public e(Throwable th2) {
        this.f3525a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f3525a, ((e) obj).f3525a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f3525a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f3525a + ')';
    }
}
