package be;
public final class e extends f {
    public final Throwable f2618a;

    public e(Throwable th2) {
        this.f2618a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f2618a, ((e) obj).f2618a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f2618a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f2618a + ')';
    }
}
