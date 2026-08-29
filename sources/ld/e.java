package ld;
public final class e extends f {
    public final Throwable f15185a;

    public e(Throwable th2) {
        this.f15185a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.j.a(this.f15185a, ((e) obj).f15185a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f15185a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f15185a + ')';
    }
}
