package ee;
public final class e extends f {
    public final Throwable f9918a;

    public e(Throwable th2) {
        this.f9918a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f9918a, ((e) obj).f9918a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f9918a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f9918a + ')';
    }
}
